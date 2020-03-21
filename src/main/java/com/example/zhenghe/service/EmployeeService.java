package com.example.zhenghe.service;

import com.example.zhenghe.model.Employee;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

//@Service
public class EmployeeService {

    @RabbitListener(queues = "test.direct.queue")
    public void receive(Employee employee) {
        System.out.println("已收到消息： " + employee);
    }

    @RabbitListener(queues = "test.direct.queue")
    public void receiveMessage(Message message) {
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
