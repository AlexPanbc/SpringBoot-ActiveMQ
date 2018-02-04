package cn.pbc.activemq.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Topic;

/**
 * Created by Alex on 2018/2/4.
 */
@Configuration
public class TopicConfig {
    @Bean
    public Topic topic() {
        return new ActiveMQTopic("topic");
    }
}
