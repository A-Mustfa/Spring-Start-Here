package org.example.repository;


import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {
    public CommentRepository(){
        System.out.println("Comment Repo bean is Created");
    }
}
