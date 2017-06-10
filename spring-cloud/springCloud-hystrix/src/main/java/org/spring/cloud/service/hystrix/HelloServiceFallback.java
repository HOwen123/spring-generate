package org.spring.cloud.service.hystrix;

import org.spring.cloud.dto.User;
import org.spring.cloud.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenssy
 * @date 2017/6/10
 * @since v1.0.0
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() throws InterruptedException {
        return "error";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "error,不知道这是谁";
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User("不知道这是谁",0);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "error,不知道这是谁";
    }
}
