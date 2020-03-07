package com.example.batchdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BatchdemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BatchdemoApplication.class, args);

        SpringApplication app = new SpringApplication(BatchdemoApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }
}
