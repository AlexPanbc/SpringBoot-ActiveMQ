package cn.pbc.activemq.controller;

import cn.pbc.activemq.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alex on 2018/2/4.
 */
@RestController
public class ProducerController {
    @Autowired
    private Producer producer;

    @GetMapping(value = "/sendqueue")
    public void sendQueue() {
        for (int i = 0; i < 100; i++)
            producer.sendQueue("queue-Hello---" + i);
    }

    @GetMapping(value = "/sendtopic")
    public void sendTopic() {
        for (int i = 0; i < 100; i++)
            producer.sendTopic("topic-Hello");
    }
}
