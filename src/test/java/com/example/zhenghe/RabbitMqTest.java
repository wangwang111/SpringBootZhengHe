package com.example.zhenghe;

import com.example.zhenghe.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class RabbitMqTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void send() {
        // message需要自己定义构造一个；定义消息体内容和消息头
//        rabbitTemplate.send(exchange, routeKey, message);

        // object默认当成消息体，只需要传入要发送的消息，自动序列化发送给rabbitmq
//        rabbitTemplate.convertAndSend(exchange, routeKey, object);
        Map<String, String> map = new HashMap<>();
        map.put("msg", "这是第一个消息！");
        rabbitTemplate.convertAndSend("test.direct", "direct", new Employee("wang", 12 ));
    }

    @Test
    public void receive() {
        Object o = rabbitTemplate.receiveAndConvert("test.direct.queue");
        System.out.println(o.getClass());
        System.out.println(o);
    }
}
