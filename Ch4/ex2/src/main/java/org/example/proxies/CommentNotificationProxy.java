package org.example.proxies;

import org.example.services.Comment;
import org.springframework.stereotype.Component;


public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
