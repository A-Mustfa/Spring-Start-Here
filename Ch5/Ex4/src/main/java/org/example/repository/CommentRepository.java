package org.example.repository;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public class CommentRepository {
    public CommentRepository(){
        System.out.println("Comment Repo bean is Created");
    }
}
