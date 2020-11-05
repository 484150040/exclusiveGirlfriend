package com.cn.exclusiveGirlfriend.common;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName QuartzAll
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/10/26 11:45
 * @Hodified By:
 **/
@Component
public class QuartzAll {
    private int count = 0;

//    @Scheduled(cron = "*/6 * * * * ?")/*每隔六秒钟执行一次*/
    private void process() {
        System.out.println("this is scheduler task runing  " + (count++));
    }
}
