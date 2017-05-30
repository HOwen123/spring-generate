package com.spring.cloud.ribbon.web;


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
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbo-consumer",method = RequestMethod.GET)
    public String hello(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }
}
