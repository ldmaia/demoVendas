package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigExample {

    @Bean
    public String applicationName(){
        return "Sistema de vendas";
    }
}
