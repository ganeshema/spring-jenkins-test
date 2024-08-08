package com.ganeshgc.springjenkinstest;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsTestApplication {
    public static Logger LOGGER= LoggerFactory.getLogger(SpringJenkinsTestApplication.class);
    @PostConstruct
    public void init(){
        LOGGER.info("Application started......................................");
    }

    public static void main(String[] args) {
        LOGGER.info("Application Execution Started......................................");
        SpringApplication.run(SpringJenkinsTestApplication.class, args);
    }



}
