package com.ll.demo.controller;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class VarTest {
    public static void main(String[] args){
        TemplateEngine templateEngine=new TemplateEngine();
        ClassLoaderTemplateResolver resolver=new ClassLoaderTemplateResolver();
        templateEngine.setTemplateResolver(resolver);
        Context context=new Context();
        context.setVariable("data","123");
        String result=templateEngine.process("upload.html",context);
        System.out.println(result);
    }
}
