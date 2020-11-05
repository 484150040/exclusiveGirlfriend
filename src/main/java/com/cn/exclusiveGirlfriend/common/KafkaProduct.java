package com.cn.exclusiveGirlfriend.common;

import com.alibaba.fastjson.JSON;
import com.cn.exclusiveGirlfriend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName KafkaUtiles
 * @Author ASUS
 * @Description TODO;   kafka消息队列（生产者）
 * @Date 2020/10/19 14:13
 * @Hodified By:
 **/
@Component
public class KafkaProduct {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String name){
        User u=new User();
        u.setName(name);
        u.setHobby("吃饭");
        kafkaTemplate.send("user", JSON.toJSONString(u));
    }
}
