package com.shalemking.springbootkafka.controller;

import com.shalemking.springbootkafka.kafka.JsonKafkaProducer;
import com.shalemking.springbootkafka.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class JsonMessageController {
    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/send")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user){
        jsonKafkaProducer.publish(user);
        return new ResponseEntity<>("Json Data sent kafka topic Successfully", HttpStatus.OK);
    }

}
