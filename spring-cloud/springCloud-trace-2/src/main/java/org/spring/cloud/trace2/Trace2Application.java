package org.spring.cloud.trace2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenssy
 * @date 2017/6/27
 * @since v1.0.0
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Trace2Application {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/trace-2")
    public String trace(){
        logger.info("===call trace-2  =====");

        return "trance-2";
    }

    public static void main(String[] args){
        SpringApplication.run(Trace2Application.class);
    }
}
