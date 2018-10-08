package com.thinking.feign.controller;

import com.thinking.feign.domain.User;
import com.thinking.feign.service.DCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/26
 */
@RestController
public class DCController {

    @Autowired
    private DCService dcService;

    @GetMapping("/consumer")
    public String dc(){
        return dcService.consumerDC();
    }

    @GetMapping("/findUser")
    public User findUser(){
        return dcService.findUser();
    }
}
