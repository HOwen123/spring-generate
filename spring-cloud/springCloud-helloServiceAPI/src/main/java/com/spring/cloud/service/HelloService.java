package com.spring.cloud.service;

import com.spring.cloud.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenssy
 * @date 2017/6/8
 * @since v1.0.0
 */

@RequestMapping("/refactor")
public interface HelloService {
    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    public String hello(@RequestBody User user);
}
