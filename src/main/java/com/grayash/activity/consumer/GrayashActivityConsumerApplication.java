package com.grayash.activity.consumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class GrayashActivityConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrayashActivityConsumerApplication.class, args);
	}
}
