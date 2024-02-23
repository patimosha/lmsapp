package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int age;
    List<Course> courses = new ArrayList<>();
    private Course course;

    public List<Course> getCaurse() {
        return (List<Course>) course;
    }

    public void setCourses(List<Course> cars) {
        this.course = (Course) courses;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Course getCourse() {
        return course;
    }


    public void setCourse(Course course) {
        this.course = course;
        courses.add(course);
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", \n  current Course = " + course +
                ", \n    old courses = " + courses +
                '}';
    }
}


