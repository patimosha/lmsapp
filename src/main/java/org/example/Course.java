package org.example;

import static org.example.Main.id;

public class Course {
    private int number;
    private String name;

    @Override
    public String toString() {
        return "Course{" +
                "number=" + number +
                ", name='" + name + '\'' +
                "} " + Integer.toHexString(hashCode()) + " ! ";
    }

    public Course() {
        number = id++;
        name = "Python for beginners";
    }

    public Course(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
