package com.learn.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.learn.dubbo.domain.User;
import com.learn.dubbo.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author GaoWeicai.(gaowc @ gfire.cn)
 * @date 2018/12/21
 */
@Service(version = "${demo.service.version}")
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User save(User user) {
        System.out.println("hello,this is a message from save user service!");
        return user;
    }
}
