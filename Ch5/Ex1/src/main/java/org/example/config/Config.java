package org.example.config;

import org.example.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    CommentService commentService(){
        return new CommentService();
    }


}
