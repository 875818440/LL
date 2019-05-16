package com.ll.demo.controller;

import com.ll.demo.entity.MyPro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProController {
    @Autowired
    private MyPro myPro;
    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public MyPro hello(){
        return myPro;
    }
}
