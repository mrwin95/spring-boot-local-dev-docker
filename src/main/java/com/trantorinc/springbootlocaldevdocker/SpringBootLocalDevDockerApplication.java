package com.trantorinc.springbootlocaldevdocker;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication(scanBasePackages = {"com.trantorinc"})
public class SpringBootLocalDevDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLocalDevDockerApplication.class, args);
	}

}
