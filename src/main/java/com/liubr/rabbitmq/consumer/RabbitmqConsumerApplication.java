package com.liubr.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class RabbitmqConsumerApplication {

    public static void main(String[] args) {
        log.info("MQ项目启动开始!!!!!!!!!!!!!!!!!!!!!!");
        SpringApplication.run(RabbitmqConsumerApplication.class, args);
        log.info("MQ项目启动成功!!!!!!!!!!!!!!!!!!!!!!");
    }

}
