package org.example.config;


import org.example.repository.CommentRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages = "org.example")
@Configuration
public class Config {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    CommentRepository commentRepository(){
        return new CommentRepository();
    }

}
