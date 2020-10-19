package com.a;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Author Administrator
 * @Date 2020/7/27 0027 19:21
 * @Description TOOO
 */
@SpringBootApplication
@MapperScan("com.a.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
