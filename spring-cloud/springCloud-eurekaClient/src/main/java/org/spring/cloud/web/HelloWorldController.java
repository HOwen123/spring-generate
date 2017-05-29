package org.spring.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenssy
 * @date 2017/5/29
 * @since v1.0.0
 */
@RestController
public class HelloWorldController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("/hello,host:" + instance.getHost() + ",service_id：" + instance.getServiceId());

        return "hello";
    }
}
