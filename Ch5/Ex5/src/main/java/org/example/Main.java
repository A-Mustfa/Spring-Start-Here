package org.example;

import org.example.config.Config;

import org.example.repository.CommentRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);


        CommentRepository cr1 = context.getBean(CommentRepository.class);
        CommentRepository cr2 = context.getBean(CommentRepository.class);

        boolean result = cr1==cr2;
        System.out.println(result);
    }
}