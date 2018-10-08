package com.thinking.swagger.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/27
 */
@RestController
public class SwaggerController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/service-b")
    public String dc(){
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        return "Services:" + services;
    }



}
