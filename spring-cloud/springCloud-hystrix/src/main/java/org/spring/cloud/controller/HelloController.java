package org.spring.cloud.controller;

import org.spring.cloud.dto.User;
import org.spring.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenssy
 * @date 2017/6/7
 * @since v1.0.0
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hystrix-consummer",method = RequestMethod.GET)
    public String hello() throws InterruptedException {
        return helloService.hello();
    }

    @RequestMapping(value = "/hystrix-consummer2",method = RequestMethod.GET)
    public String hello2() throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("chenssy")).append("\n");
        sb.append(helloService.hello("chenssy", 100)).append("\n");
        sb.append(helloService.hello(new User("chenssy",100))).append("\n");

        return sb.toString();
    }
}
