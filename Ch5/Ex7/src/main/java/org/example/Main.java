package org.example;

import org.example.config.Config;
import org.example.services.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        var cs1 = context.getBean(CommentService.class);
        cs1.sendComment(new Comment());

    }
}