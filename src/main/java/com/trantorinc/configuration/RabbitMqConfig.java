package com.trantorinc.configuration;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
 
    public static final String QUEUE_NAME = "q.test-queue";
    public static final String EXCHANGE_NAME = "x.test-exchange";

    // @Bean
    // Queue queue(){

    //     // return new Queue(QUEUE_NAME, false);
    // }
}
