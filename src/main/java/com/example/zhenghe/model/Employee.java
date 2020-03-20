package com.example.zhenghe.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {

    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Employee() {
    }
}
