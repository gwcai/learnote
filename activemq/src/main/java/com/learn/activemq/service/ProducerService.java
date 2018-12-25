package com.learn.activemq.service;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Queue;

/**
 * @author GaoWeicai.(gaowc @ gfire.cn)
 * @date 2018/12/25
 */
@Service
public class ProducerService implements IMessageProducer {
    @Resource
    private JmsMessagingTemplate messagingTemplate;
    @Resource
    private Queue queue;

    @Override
    public void sendMessage(String msg) {
        messagingTemplate.convertAndSend(queue,msg);
    }
}
