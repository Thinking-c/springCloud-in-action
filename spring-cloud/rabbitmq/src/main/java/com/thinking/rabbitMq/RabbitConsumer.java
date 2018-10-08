package com.thinking.rabbitMq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/27
 */
@Component
@RabbitListener(queues = "hello")
public class RabbitConsumer {

    @RabbitHandler
    public void process(String hello){
        System.out.println("RabbitConsumer:" + hello);
    }


}
