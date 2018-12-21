package com.learn.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.learn.dubbo.domain.User;
import com.learn.dubbo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GaoWeicai.(gaowc @ gfire.cn)
 * @date 2018/12/21
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Reference(version = "${demo.service.version}")
    UserService userService;

    @RequestMapping("save")
    public User saveUser() {
        User user = new User();
        userService.save(user);
        return new User();
    }
}
