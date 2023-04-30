package com.example;

import com.example.repositories.StudentRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example");
        StudentRepository studentRepository = applicationContext.getBean(StudentRepository.class);

        System.out.println(studentRepository.findAll());
    }
}
