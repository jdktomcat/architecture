package com.jdktomcat.spring.boot.dubbo.customer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class DubboConsumerApplication {

	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(DubboConsumerApplication.class, args);
	}

}
