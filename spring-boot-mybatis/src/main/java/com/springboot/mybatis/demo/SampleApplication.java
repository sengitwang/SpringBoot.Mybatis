package com.springboot.mybatis.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by sen on 2016/7/29.
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@MapperScan("com.springboot.mybatis.demo.mapper")
public class SampleApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleApplication.class, args);
    }
}