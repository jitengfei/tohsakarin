package com.c4.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.c4.entity.User;
import com.c4.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    private UserService userService;

    @RequestMapping("/user/{id}")
    public String test(@PathVariable Long id){
        User user = userService.findUserByUserId(id);
        return user.getId().toString();
    }

}
