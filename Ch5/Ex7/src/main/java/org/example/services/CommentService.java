package org.example.services;


import org.example.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

@Autowired
    private ApplicationContext applicationContext;


    public void sendComment(Comment comment){
        CommentProcessor com = applicationContext.getBean(CommentProcessor.class);
        com.setComment(comment);
        com.processComment(comment);
        com.validateComment(comment);
        com.getComment();
    }
}
