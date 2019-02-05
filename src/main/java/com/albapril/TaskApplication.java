package com.albapril;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication

public class TaskApplication extends SpringBootServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(TaskApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TaskApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }
}
