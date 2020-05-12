package com.swat018.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfiguration {
    @Bean
    @Profile("test")
    public BookReposiitory bookReposiitory() {
        return new TestBookRepository();
    }
}
