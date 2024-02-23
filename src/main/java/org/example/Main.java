package org.example;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static int id = 3;
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Course course = (Course) context.getBean("Java Core");
        System.out.println(course);

        Course courseJava = (Course) context.getBean("Java for Beginners");
        System.out.println(courseJava);

        Teacher ctxTeacher = (Teacher) context.getBean("Jasmin");
        Student ctxstu = (Student) context.getBean("Akniet");

        ctxTeacher.setCourse(course);
        ctxTeacher.setCourse(courseJava);
        ctxstu.setCourse(course);
        System.out.println(ctxTeacher);
        System.out.println(ctxstu);
    }
}