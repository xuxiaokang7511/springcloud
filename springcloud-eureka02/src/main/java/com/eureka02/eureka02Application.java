package com.eureka02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eureka02Application {
    public static void main(String[] args) {
        SpringApplication.run(eureka02Application.class,args);
    }
}
