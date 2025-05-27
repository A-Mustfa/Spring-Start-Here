package org.example.proxies;

import org.example.services.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
