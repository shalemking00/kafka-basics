package com.shalemking.springbootkafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    public void sendMessage(String message){
        log.info(String.format("Message sent: %s",message));
        kafkaTemplate.send(topicName,message);
    }
}
