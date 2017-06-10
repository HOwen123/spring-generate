package org.spring.cloud.service;

import com.spring.cloud.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author chenssy
 * @date 2017/6/8
 * @since v1.0.0
 */
@FeignClient(value = "hello-service")
public interface RefactorHelloService extends HelloService {
}
