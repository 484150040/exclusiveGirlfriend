package com.cn.exclusiveGirlfriend;
/**
 * @ClassName ExclusiveGirlfriend
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/7 19:00
 * @Hodified By:
 **/

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName ExclusiveGirlfriend
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/7 19:00
 * @Hodified By:
 **/
@SpringBootApplication
@MapperScan("com.cn.exclusiveGirlfriend.mapper")
@EnableScheduling
@Configuration
public class ExclusiveGirlfriend {
    public static void main(String[] args) {
        SpringApplication.run(ExclusiveGirlfriend.class, args);
    }

}
