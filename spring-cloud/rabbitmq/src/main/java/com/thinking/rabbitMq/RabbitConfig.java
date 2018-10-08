package com.thinking.rabbitMq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/27
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue(){
        return  new Queue("hello");
    }

}
