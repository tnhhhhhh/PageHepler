package com.tnh.pagehelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.tnh.pagehelper.mapper")
public class PagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagehelperApplication.class, args);
    }

}
