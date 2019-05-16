package com.ll.demo.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Animal {

    private String name;
    private String type;
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
}
