package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class School {
    String name;
    int age;
    int experience;


    public School(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
}
