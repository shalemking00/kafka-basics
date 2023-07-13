package com.shalemking.springbootkafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "myGroup")
    public void consume(String message){
        log.info(String.format("Received Message is : %s",message));
    }
}
