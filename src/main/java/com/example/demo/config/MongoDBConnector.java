package com.example.demo.config;

import com.example.demo.beans.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDBConnector extends MongoRepository<Message, String> {

}
