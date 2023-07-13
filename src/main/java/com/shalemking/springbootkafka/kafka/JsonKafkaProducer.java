package com.shalemking.springbootkafka.kafka;

import com.shalemking.springbootkafka.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaProducer {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void publish(User user){
        log.info(String.format("Message sent : %s",user.toString()));
        Message<User> message= MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC,topicName)
                .build();
        kafkaTemplate.send(message);
    }


}
