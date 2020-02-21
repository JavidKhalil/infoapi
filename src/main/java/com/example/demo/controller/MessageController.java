package com.example.demo.controller;

import com.example.demo.beans.Message;
import com.example.demo.config.MongoDBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class MessageController {

    @Autowired
    private MongoDBConnector mongoRepository;

    @GetMapping("/")
    public List<Message> getMessages(){
        return mongoRepository.findAll();
    }

    @PostMapping("/v1/add/msg")
    public Message addMesage(@RequestBody(required = false) Message message){
        return mongoRepository.save(message);
    }

}
