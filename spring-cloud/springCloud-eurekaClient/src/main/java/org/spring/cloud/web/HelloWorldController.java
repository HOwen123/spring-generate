package org.spring.cloud.web;

import com.spring.cloud.dto.User;
import com.spring.cloud.service.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenssy
 * @date 2017/5/29
 * @since v1.0.0
 */
@RestController
public class HelloWorldController implements HelloService{
    @Override
    public String hello() {
        return "hello";
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
