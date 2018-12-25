package com.learn.activemq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @author GaoWeicai.(gaowc @ gfire.cn)
 * @date 2018/12/25
 */
@Service
public class ConsumerService {
    @JmsListener(destination = "study.msg.queue")
    public void receiveMessage(String text){
        System.out.println("【收到消息】：" + text);
    }
}
