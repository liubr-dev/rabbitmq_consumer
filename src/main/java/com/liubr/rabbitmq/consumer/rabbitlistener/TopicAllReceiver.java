package com.liubr.rabbitmq.consumer.rabbitlistener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * <p>
 * TopicTotalReceiver
 * <p>
 *
 * @author liubr
 * @since 2020-05-15 10:24:56
 */
@Slf4j
@Component
@RabbitListener(queues = "topic.all")
public class TopicAllReceiver {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("TopicAllReceiver消费者收到消息  : " + testMessage.toString());
    }
}
