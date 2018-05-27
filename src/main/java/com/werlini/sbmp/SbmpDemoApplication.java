package com.werlini.sbmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.werlini.sbmp.mapper")
public class SbmpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmpDemoApplication.class, args);
    }
}
