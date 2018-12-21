package com.learn.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.learn.dubbo.domain.User;
import com.learn.dubbo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author GaoWeicai.(gaowc @ gfire.cn)
 * @date 2018/12/21
 */
@SpringBootApplication
public class ClientApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Reference
    UserService userService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        userService.save(user);
    }
}
