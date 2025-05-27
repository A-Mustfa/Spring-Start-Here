package org.example;

import org.example.proxies.CommentNotificationProxy;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.repositories.CommentRepository;
import org.example.repositories.DBCommentRepository;
import org.example.services.Comment;
import org.example.services.CommentService;

public class Main {
    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        Comment comment = new Comment();
        comment.setAuthor("ahmed");
        comment.setText("tomorrow we play football");

        CommentService commentService = new CommentService(commentRepository,commentNotificationProxy);
        commentService.publishComment(comment);
    }
}