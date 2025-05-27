package org.example.repositories;

import org.example.services.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
