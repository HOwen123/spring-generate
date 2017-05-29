package org.spring.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenssy
 * @date 2017/5/29
 * @since v1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
