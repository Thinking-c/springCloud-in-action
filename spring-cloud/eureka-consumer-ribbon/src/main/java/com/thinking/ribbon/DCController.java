package com.thinking.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/26
 */
@RestController
public class DCController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon_consumer")
    public String dc(){
        return restTemplate.getForObject("http://eureka-client/", String.class);
    }
}
