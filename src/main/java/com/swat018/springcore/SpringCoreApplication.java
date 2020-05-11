package com.swat018.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import out.MyService;

@SpringBootApplication
public class SpringCoreApplication {

    @Autowired
    MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);
    }

}
