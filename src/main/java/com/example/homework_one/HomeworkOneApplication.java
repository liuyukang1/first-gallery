package com.example.homework_one;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.example.homework_one.dao")
@ServletComponentScan
public class HomeworkOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeworkOneApplication.class, args);
    }
}
