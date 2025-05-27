package org.example;

import org.example.config.Config;
import org.example.services.CommentService;
import org.example.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        var cs1 = context.getBean(CommentService.class);
        var cs2 = context.getBean(UserService.class);

        boolean result = cs1.getCommentRepository() == cs2.getCommentRepository() ;
        System.out.println(result);

    }
}