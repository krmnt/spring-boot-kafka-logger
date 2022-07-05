package com.kierangelo.springbootkafkalogger.consumer;

import com.kierangelo.springbootkafkalogger.entity.KafkaMessage;
import com.kierangelo.springbootkafkalogger.service.KafkaMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @Autowired
    private KafkaMessageService kafkaMessageService;

    @KafkaListener(topics = "TestTopic", groupId = "group_id")
    public void consume(String message)
    {
        KafkaMessage kafkaMessage = new KafkaMessage();
        kafkaMessage.setId(kafkaMessage.getId());
        kafkaMessage.setMessage(message);
        kafkaMessageService.save(kafkaMessage);
    }



}