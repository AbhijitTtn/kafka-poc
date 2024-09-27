package com.example.demo.service;

import com.example.demo.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public boolean updateMessage(String message, String key) {
        System.out.println("updateMessage "+ key);
        kafkaTemplate.send(AppConstant.MESSAGE_TOPIC,key, message);
        return true;
    }
}
