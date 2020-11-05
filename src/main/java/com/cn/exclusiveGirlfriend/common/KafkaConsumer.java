package com.cn.exclusiveGirlfriend.common;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.checkerframework.checker.units.qual.C;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @ClassName KafkaConsumerUtiles
 * @Author ASUS
 * @Description TODO;   kafka消息队列（消费者）
 * @Date 2020/10/19 14:15
 * @Hodified By:
 **/
@Component
public class KafkaConsumer {
    @KafkaListener(topics = "user")
    public void consumer(ConsumerRecord consumerRecord){
        Optional<Object> kafkaMassage = Optional.ofNullable(consumerRecord.value());
        if(kafkaMassage.isPresent()){
            Object o = kafkaMassage.get();
            System.out.println(o);
        }

    }
}
