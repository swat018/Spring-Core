package com.swat018.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;
import out.MyService;

import java.util.function.Supplier;

@SpringBootApplication
public class SpringCoreApplication {

    @Autowired
    MyService myService;

    public static void main(String[] args) {
//        SpringApplication.run(SpringCoreApplication.class, args);
        var app = new SpringApplication(SpringCoreApplication.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
            ctx.registerBean(MyService.class);
            ctx.registerBean(ApplicationRunner.class, () -> (ApplicationRunner) args1 -> System.out.println("Funational Bean Definition!!"));
        });
        app.run(args);
    }

}
