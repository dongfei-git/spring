package tech.dongfei.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // 把当前类作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"tech.dongfei.spring"})
public class SpringConfig {
}
