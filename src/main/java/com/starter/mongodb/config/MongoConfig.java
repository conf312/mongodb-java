package com.starter.mongodb.config;
import com.mongodb.client.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

    private static final String URI = "mongodb://localhost:27017";
    private static final String DATABASE = "sample";

    @Bean
    public MongoDatabase mongoCollection() {
        MongoClient mongoClient = MongoClients.create(URI);
        MongoDatabase database = mongoClient.getDatabase(DATABASE);
        return database;
    }
}
