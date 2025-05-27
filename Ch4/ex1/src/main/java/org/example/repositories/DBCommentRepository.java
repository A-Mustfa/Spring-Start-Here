package org.example.repositories;

import org.example.services.Comment;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment to database : "+ comment.getText());
    }
}
