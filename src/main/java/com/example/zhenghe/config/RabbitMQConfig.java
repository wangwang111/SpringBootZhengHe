package com.example.zhenghe.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Spring支持
 * spring-jms提供了对jms的支持
 * spring-rabbit提供了对AMQP的支持
 * 需要JmsTemplate、RabbitTemplate来发送消息
 * @JmsListener(JMS)、@RabbitListener(AMQP)注解在方法上监听消息代理发布消息
 * @EnsbleJms、@EnableRabbit开启支持
 */
//@Configuration
public class RabbitMQConfig {

//    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
