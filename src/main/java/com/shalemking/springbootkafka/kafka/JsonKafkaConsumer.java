package com.shalemking.springbootkafka.kafka;

import com.shalemking.springbootkafka.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "myGroup")
    public void consume(User user){
        log.info(String.format("Json data received: %s",user.toString()));

    }

}
