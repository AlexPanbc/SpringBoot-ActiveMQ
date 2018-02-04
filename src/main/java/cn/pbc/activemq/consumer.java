package cn.pbc.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by Alex on 2018/2/4.
 */
@Service
public class consumer {

    @JmsListener(destination = "queue")
    public void queueMessage1(String text) throws InterruptedException {
        System.err.println("queue1----------" + text);
        Thread.sleep(50);
    }

    @JmsListener(destination = "queue")
    public void queueMessage2(String text) {
        System.out.println("queue2----------" + text);
    }




    @JmsListener(destination = "topic")
    public void topicMessage(String text) {
        System.out.println("topicMessage1-----topic-----------------" + text);
    }

    @JmsListener(destination = "topic")
    public void topicMessage2(String text) {
        System.err.println("topicMessage2-----topic-----------------" + text);
    }
}
