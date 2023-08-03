package com.example.kafka.consumer;

import com.example.kafka.constants.KafkaConstants;
import com.example.kafka.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @Autowired
    private SimpMessagingTemplate template;

    //   lắng nghe sử lý logic trong từng bản ghi
    @KafkaListener(topics = KafkaConstants.KAFKA_TOPIC , groupId = KafkaConstants.GROUP_ID)
    public void listener(Message message){
        System.out.println("Listener received");
//        Message message = (Message) object;
        template.convertAndSend("/topic/group", message);
    }

}