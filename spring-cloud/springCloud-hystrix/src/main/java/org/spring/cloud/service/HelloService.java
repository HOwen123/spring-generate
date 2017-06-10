package org.spring.cloud.service;

import org.spring.cloud.dto.User;
import org.spring.cloud.service.hystrix.HelloServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenssy
 * @date 2017/6/10
 * @since v1.0.0
 */
@FeignClient(value = "hello-service",fallback = HelloServiceFallback.class)
public interface HelloService {

    @RequestMapping("/refactor/hello")
    String hello() throws InterruptedException;

    @RequestMapping(value = "/refactor/hello1",method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/refactor/hello2",method = RequestMethod.GET)
    public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age);

    @RequestMapping(value = "/refactor/hello3",method = RequestMethod.POST)
    public String hello(@RequestBody User user);
}
