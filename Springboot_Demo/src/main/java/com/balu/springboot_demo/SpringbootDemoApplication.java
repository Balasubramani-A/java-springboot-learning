package com.balu.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);

        Student s = context.getBean(Student.class);
        s.setRollNo(101);
        s.setName("Navin");
        s.setMarks(78);

        addStudent(s);



    }
}
