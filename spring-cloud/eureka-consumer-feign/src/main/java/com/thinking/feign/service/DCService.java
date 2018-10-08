package com.thinking.feign.service;

import com.thinking.feign.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/26
 */
@FeignClient("eureka-client")
public interface DCService {

    @GetMapping("/dc")
    String consumerDC();

    @GetMapping("/findUser")
    User findUser();

}
