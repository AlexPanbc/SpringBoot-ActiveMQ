package cn.pbc.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate ;
import org.springframework.stereotype.Service;

import javax.jms.Queue;
import javax.jms.Topic;


/**
 * Created by Alex on 2018/2/4.
 */
@Service
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;
    @Autowired
    private Topic topic;

    public void sendQueue(String msg) {
        jmsMessagingTemplate.convertAndSend(queue,"queue消息：" + msg);
    }
    public void sendTopic(String msg) {
        jmsMessagingTemplate.convertAndSend(topic,"topic消息" + msg);
    }
}
