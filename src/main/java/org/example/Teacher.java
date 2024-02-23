package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    String name;
    int age;
    int experience;

    @Qualifier("Java Core")
    @Autowired
    Course course123;

    List<Course> courses = new ArrayList<>();
    private Course course;

    public List<Course> getCars() {
        return (List<Course>) course;
    }

    public void setCars(List<Course> cars) {
        this.course = (Course) courses;
    }

    public Teacher(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Course getCorse() {
        return course;
    }


    public void setCourse(Course course) {
        this.course = course;
        courses.add(course);
    }

    @Override
    public String toString() {
        return "\nTeacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", \n  current Course = " + course +
                ", \n    old courses = " + courses +
                " " + course123 + " " +

        '}';
    }
}

