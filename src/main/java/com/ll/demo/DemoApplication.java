package com.ll.demo;

import com.ll.demo.config.AnimalQualifier;
import com.ll.demo.entity.Animal;
import com.ll.demo.scan.MyCompen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableSpringConfigured
@RestController
@ComponentScan(basePackages = "com.ll.demo",excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes=MyCompen.class)})
public class DemoApplication {

    public static void main(String[] args) {
        //new SpringApplicationBuilder(DemoApplication.class).properties("spring.config.location=classpath:/../application.yml").run(args);
       SpringApplication.run(DemoApplication.class, args);
    }
    @Autowired
    private ApplicationContext ctx;
    @Autowired
    @AnimalQualifier(type = "cat")
    private Animal animal;
    @GetMapping("/scan")
    public String scan(){
        System.out.println(ctx.getBean("MyCompen"));
        return "";
    }

    @GetMapping("/cus")
    public String cus(){
        System.out.println(animal.getName());
        return "";
    }

}
