package com.example.demo.controller;

import com.example.demo.Dto.MessageDTO;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/send")
public class MessageController {

    @Autowired
    private MessageService messageService;


//    @PutMapping()
//    public ResponseEntity sendMessage()  {
//
//        int range = 10;
//        while (range > 0) {
//                 messageService.updateMessage("Message "+range, null);
//            System.out.println("Hello "+ range);
//            range --;
//        }
//
//        return new ResponseEntity<>(Map.of("message", "Message Sent")
//                , HttpStatus.OK);
//    }

    @PostMapping()
    public ResponseEntity<Map<String, String>> sendMessage(@RequestParam String key,
                                                           @RequestBody MessageDTO message) {
        System.out.println(key);
        System.out.println(message);
        int range = 1;
        while (range <= 10) {
            messageService.updateMessage(message.getMessage() + range ,key);
           // System.out.println("Message ID: " + id + " | Message " + range + ": " + message);
            range++;
        }
        return new ResponseEntity<>(Map.of("message", "Message Sent to ID " ), HttpStatus.OK);
    }
}