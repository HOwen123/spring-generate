package org.spring.cloud.web;

import com.spring.cloud.dto.User;
import com.spring.cloud.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author chenssy
 * @date 2017/5/29
 * @since v1.0.0
 */
@RestController
public class HelloWorldController implements HelloService{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public String hello() throws InterruptedException {
        return "hello world，chenssy";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello , " + name;
    }

    @Override
    public com.spring.cloud.dto.User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "hello ," + user.getName() + " , " + user.getAge();
    }
}
