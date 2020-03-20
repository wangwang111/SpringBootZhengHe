package com.example.zhenghe;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@EnableRabbit	// 开启基于注解的Rabbit模式
@SpringBootApplication
public class SpringbootzhengheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootzhengheApplication.class, args);
	}

}
