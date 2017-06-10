package org.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenssy
 * @date 2017/5/29
 * @since v1.0.0
 */
@EnableEurekaClient
@SpringBootApplication
public class HelloServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(HelloServiceApplication.class,args);
    }
}
