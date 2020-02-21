package com.example.demo.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;

@Profile("test")
@Configuration
public class MongoDBTestConfig {

    @Bean
    @Primary
    public MongoDBConnector getMongoConnector(){
        return Mockito.mock(MongoDBConnector.class);
    }

}
