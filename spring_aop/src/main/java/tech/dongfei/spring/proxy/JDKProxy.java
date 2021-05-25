package tech.dongfei.spring.proxy;

import tech.dongfei.spring.dao.UserDao;
import tech.dongfei.spring.dao.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        // 创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println(result);
    }
}

/**
 * 创建代理对象
 */
class UserDaoProxy implements InvocationHandler {

    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * 增强的逻辑
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在方法之前执行
        System.out.println("方法之前执行..."+method.getName()+ Arrays.toString(args));

        // 被增强的方法执行
        Object res = method.invoke(obj, args);

        // 在方法之后执行
        System.out.println("在方法执行之后..."+obj);

        return res;
    }
}