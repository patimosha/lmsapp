package org.example.config;

import org.example.Teacher;
import org.example.Course;
import org.example.Student;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.example.Main.id;
@Configuration
public class ProjectConfig {
    @Bean("Python for beginners")
    Course course(){
        var c = new Course();
        c.setName("Python for beginners");
        return c;
    }
    @Bean(value = "Java for Beginners")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Course creatCourse() {
        return new Course();
    }

    @Bean(name = "Java Core")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Course creatCourseJava() {
        return new Course(id++, "Java Core");
    }

    @Bean("Jasmin")
    Teacher jas(){
        Teacher jasmin = new Teacher(
                "Jasmin",
                30,
                14
                );

//        ruslan.setCar(creatTaxi());

        return jasmin;

    }
    @Bean("Akniet")
    Student stu(){
        Student Akniet = new Student(
                "Akniet",
                18
        );

//        ruslan.setCar(creatTaxi());

        return Akniet;

    }
}
