package com.thinking.rabbitMq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/27
 */
@Component
public class RabbitProvider {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendTest(){
        String content = "hello:" + new Date();
        System.out.println("RabbitProvider:" + content);
        amqpTemplate.convertAndSend("hello", content);

    }

}
