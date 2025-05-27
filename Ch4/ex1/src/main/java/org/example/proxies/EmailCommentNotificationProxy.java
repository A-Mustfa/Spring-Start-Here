package org.example.proxies;

import org.example.services.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("sending comment via email: " + comment.getText());
    }
}
