package org.example;

import org.example.config.Config;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean("commentService",CommentService.class);

        boolean result = cs1 == cs2 ;
        System.out.println(result);

    }
}