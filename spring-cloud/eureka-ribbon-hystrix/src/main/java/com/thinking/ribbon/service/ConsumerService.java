package com.thinking.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/26
 */
@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "60000")
    }, threadPoolProperties = {
            @HystrixProperty(name = "coreSize", value = "1000")
    })
    public String consumer(){
        return restTemplate.getForObject("http://eureka-client/fallback", String.class);
    }

    public String fallback(){
        return "fallback";
    }

}
