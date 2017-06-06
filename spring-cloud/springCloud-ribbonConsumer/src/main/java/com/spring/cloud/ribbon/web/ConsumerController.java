package com.spring.cloud.ribbon.web;


import com.spring.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenssy
 * @date 2017/5/29
 * @since v1.0.0
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/ribbo-consumer",method = RequestMethod.GET)
    public String hello(){
        return helloService.helloService();
    }
}
