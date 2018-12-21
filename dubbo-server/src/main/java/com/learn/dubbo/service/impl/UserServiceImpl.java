package com.learn.dubbo.service.impl;

import com.learn.dubbo.domain.User;
import com.learn.dubbo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author GaoWeicai.(gaowc @ gfire.cn)
 * @date 2018/12/21
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User save(User user) {
        System.out.println("hello,this is a message from save user service!");
        return user;
    }
}
