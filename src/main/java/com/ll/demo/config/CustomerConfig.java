package com.ll.demo.config;

import com.ll.demo.entity.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Bean
    @AnimalQualifier(type = "person")
    public Animal personBean(){
       return new Animal("Sandy");
    }

    @Bean
    @AnimalQualifier(type = "cat")
    public Animal catBean(){
        return new Animal("tom");
    }
}
