package org.spring.cloud.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author chenssy
 * @date 2017/7/29
 * @since v1.0.0
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerApplication {
    public static void main(String[] args){
        SpringApplication.run(ZipkinServerApplication.class,args);
    }
}
