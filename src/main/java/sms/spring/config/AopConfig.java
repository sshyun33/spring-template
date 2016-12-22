package sms.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import sms.aop.LoggingAspect;
import sms.aop.PointCutDefinition;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    public PointCutDefinition pointCutDefinition() {
        return new PointCutDefinition();
    }
}