package org.spring.cloud.controller;

import com.spring.cloud.dto.User;
import org.spring.cloud.service.RefactorHelloService;
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

//    @Autowired
//    private HelloService helloService;

    @Autowired
    private RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consummer",method = RequestMethod.GET)
    public String hello() throws InterruptedException {
        return refactorHelloService.hello();
    }

    @RequestMapping(value = "/feign-consummer2",method = RequestMethod.GET)
    public String hello2() throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello()).append("\n");
        sb.append(refactorHelloService.hello("chenssy")).append("\n");
        sb.append(refactorHelloService.hello("chenssy", 100)).append("\n");
        sb.append(refactorHelloService.hello(new User("chenssy",100))).append("\n");

        return sb.toString();
    }

}
