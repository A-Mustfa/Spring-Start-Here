package org.example;

import org.example.config.Config;

import org.example.repository.CommentRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);


        System.out.println("before referring to the bean");
        CommentRepository cr = context.getBean(CommentRepository.class);
        System.out.println("after referring to bean");

    }
}