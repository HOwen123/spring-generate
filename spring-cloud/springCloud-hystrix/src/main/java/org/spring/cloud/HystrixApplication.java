package org.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author chenssy
 * @date 2017/6/7
 * @since v1.0.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixApplication {
    
    public static void main(String[] args){
        SpringApplication.run(HystrixApplication.class,args);
    }
}
