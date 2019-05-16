package com.ll.demo.controller;

import com.ll.demo.entity.Animal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args){
        Animal animal=new Animal("cat");
        animal.setType("1");
        Animal animal2=new Animal("cat");
        animal2.setType("1");
        System.out.println(animal.getName());
        System.out.println(animal2.getName());
        System.out.println(animal.equals(animal2));
    }
}
