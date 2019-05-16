package com.ll.demo.controller;

import com.ll.demo.entity.MyPro;
import com.ll.demo.service.SaleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOError;
import java.io.IOException;

@Controller("TestController")
public class TestController {
    @Autowired
    private Environment env;
    @Autowired
    private SaleServiceImp saleServiceImp;
    @RequestMapping("/ua")
    @ResponseBody
    public String getPro(){
        String sss;
        String s=env.getProperty("user.test.name");
        return s;
    }
    @ResponseBody
    @RequestMapping("test")
    public String test(){
        return "hello5";
    }

    @ResponseBody
    @RequestMapping("proxy")
    public void proxy(){
         saleServiceImp.saleService();
    }
    @ResponseBody
    @RequestMapping("upload")
    public String upload(@RequestParam("file")MultipartFile file)throws IOException {

        byte[] content=file.getBytes();
        System.out.println(content);
        return "success";
    }
}
