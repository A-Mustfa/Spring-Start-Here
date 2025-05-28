package com.example.Ch11_Ex1_OpenFeign.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.Ch11_Ex1_OpenFeign")
public class AppConfig {
}
