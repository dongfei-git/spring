package tech.dongfei.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = "tech.dongfei.spring.aop")
@EnableAspectJAutoProxy
public class SpringConfig {
}
