package com.lecode.kafkaconsumer.config.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.lecode.kafkaconsumer.dto.PersonDTO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PersonService {
    
    @KafkaListener(topics = "topic-person", groupId = "group1")
    public void consumingFromKafka(PersonDTO personDTO) {
        log.info("[Consuming message from kafka]");
        log.info("[PersonDTO]: {}", personDTO);
        log.info("[Finishing the person's consume]");
    }

}
