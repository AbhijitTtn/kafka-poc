package org.example.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.example.constant.AppConstant;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    @KafkaListener(topics = AppConstant.MESSAGE_TOPIC, groupId = "user-group")
    public void consumeMessage(ConsumerRecord<String, String> record) {
        String key = record.key();
        String message = record.value();
        System.out.println("Key: " + key + "  Messeage: " + message);
    }

}
