package com.ll.demo.config;

import com.ll.demo.entity.MyPro;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = MyPro.class)
public class MyConfig {
}
