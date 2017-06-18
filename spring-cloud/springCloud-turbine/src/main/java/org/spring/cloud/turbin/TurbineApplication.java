package org.spring.cloud.turbin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author chenssy
 * @date 2017/6/17
 * @since v1.0.0
 */
@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class TurbineApplication {
    public static void main(String[] args){
        SpringApplication.run(TurbineApplication.class,args);
    }
}
