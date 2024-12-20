package com.yuntuku;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.yuntuku.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)  // 启用AspectJ自动代理并暴露代理对象
public class YuntukuApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuntukuApplication.class, args);
    }

}
