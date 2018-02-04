package cn.pbc.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;


/**
 * Created by Alex on 2018/2/4.
 */
@Configuration
public class QueueConfig {
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("queue");
    }
}
