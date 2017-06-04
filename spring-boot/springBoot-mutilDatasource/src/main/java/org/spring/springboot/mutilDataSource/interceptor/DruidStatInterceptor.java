package org.spring.springboot.mutilDataSource.interceptor;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.context.annotation.Bean;

/**
 * @author chenssy
 * @date 2017/6/4
 * @since v1.0.0
 */
public class DruidStatInterceptor {

    private static final String[] patterns = new String[]{"org.spring.springboot.mutilDataSource.service.*"};

    @Bean
    public DruidStatInterceptor druidStatInterceptor() {
        return new DruidStatInterceptor();
    }

    @Bean
    public JdkRegexpMethodPointcut druidStatPointcut() {
        JdkRegexpMethodPointcut druidStatPointcut = new JdkRegexpMethodPointcut();
        druidStatPointcut.setPatterns(patterns);
        return druidStatPointcut;
    }

    @Bean
    public Advisor druidStatAdvisor() {
        return new DefaultPointcutAdvisor(druidStatPointcut(), (Advice) druidStatInterceptor());
    }
}
