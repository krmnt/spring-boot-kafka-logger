package com.kierangelo.springbootkafkalogger.service;

import com.kierangelo.springbootkafkalogger.entity.KafkaMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KafkaMessageService extends MongoRepository<KafkaMessage, Integer> {

}
