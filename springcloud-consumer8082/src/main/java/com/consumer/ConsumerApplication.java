package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //开启Eureka 客户端
public class ConsumerApplication {
    public static void main(String[] args) {
            SpringApplication.run(ConsumerApplication.class, args);
    }


}
