package tech.dongfei.spring.bean;

public class Order {
    private String oname;

    public Order() {
        System.out.println("第一步 创建对象");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 调用set方法设置值");
    }

    public void initMethod() {
        System.out.println("第三步 初始化方法");
    }

    public void destroyMethod() {
        System.out.println("第五步 执行销毁的方法");
    }

    @Override
    public String toString() {
        return "Order{" +
                "oname='" + oname + '\'' +
                '}';
    }
}
