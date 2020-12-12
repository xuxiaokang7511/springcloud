package com.eureka03;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eureka03Application {
    public static void main(String[] args) {
        SpringApplication.run(eureka03Application.class,args);
    }

}
