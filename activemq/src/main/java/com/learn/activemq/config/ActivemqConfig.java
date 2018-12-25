package com.learn.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;


/**
 * @author GaoWeicai.(gaowc @ gfire.cn)
 * @date 2018/12/25
 */
@Configuration
@EnableJms
public class ActivemqConfig {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("study.msg.queue");
    }
}
