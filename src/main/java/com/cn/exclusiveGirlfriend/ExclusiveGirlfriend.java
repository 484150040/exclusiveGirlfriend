package com.cn.exclusiveGirlfriend;
/**
 * @ClassName ExclusiveGirlfriend
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/7 19:00
 * @Hodified By:
 **/

import com.cn.exclusiveGirlfriend.common.KafkaProduct;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;

/**
 * @ClassName ExclusiveGirlfriend
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/7 19:00
 * @Hodified By:
 **/
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
@MapperScan("com.cn.exclusiveGirlfriend.mapper")
@EnableScheduling
@Configuration
public class ExclusiveGirlfriend {
    private static final Logger log = LoggerFactory.getLogger(ExclusiveGirlfriend.class);
 /*   @Autowired
    private KafkaProduct product;
    @PostConstruct
    public void init(){
        for(int i=0;i<10;i++){
            product.send("afs"+i);
        }
    }*/
//    消息队列需求一个表存储数据

    public static void main(String[] args) {
        SpringApplication.run(ExclusiveGirlfriend.class, args);
    }

}
