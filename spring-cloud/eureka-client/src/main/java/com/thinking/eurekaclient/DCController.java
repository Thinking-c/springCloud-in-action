package com.thinking.eurekaclient;

import com.thinking.eurekaclient.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/26
 */
@RestController
public class DCController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc(){
        List<String> services = discoveryClient.getServices();
        List<ServiceInstance> instances = discoveryClient.getInstances("eureka-client");
        System.out.println("services:" + services);
        System.out.println("-------------------------------------------------");
        System.out.println("instances:" + instances.get(0));
        System.out.println("instances.getHost:" + instances.get(0).getHost());
        System.out.println("instances.getServiceId:" + instances.get(0).getServiceId());
        System.out.println("instances.getMetadata:" + instances.get(0).getMetadata());
        System.out.println("instances.getPort:" + instances.get(0).getPort());
        System.out.println("instances.getUri:" + instances.get(0).getUri());
        System.out.println("instances.isSecure:" + instances.get(0).isSecure());
        return "services:" + services;
    }

    @GetMapping("/findUser")
    public User findUser(){
        User user = new User();
        List<String> loves = new ArrayList<>();
        loves.add("篮球");
        loves.add("羽毛球");
        loves.add("游戏");
        loves.add("football");
        user.setName("张三");
        user.setAge(18);
        user.setGender("男");
        user.setLoves(loves);

        return user;
    }

    @GetMapping("/fallback")
    public String fallbackTest(){

        List<String> services = discoveryClient.getServices();

//        try {
//            Thread.sleep(50000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "services:" + services;

    }

}
