package com.learn.activemq;

import com.learn.activemq.service.IMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @author GaoWeicai.(gaowc @ gfire.cn)
 * @date 2018/12/25
 */
@SpringBootApplication
public class ActivemqApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ActivemqApplication.class, args);
    }

    @Resource
    private IMessageProducer messageProducer;

    @Override
    public void run(String... args) throws Exception {
        for (int x = 0; x < 10; x++) {
            this.messageProducer.sendMessage("study - " + x);
        }
    }
}
