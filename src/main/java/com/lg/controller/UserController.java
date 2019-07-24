package com.lg.controller;

import com.lg.entity.User;
import com.lg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return "Index";
    }

    @RequestMapping("/findAll")
    public String findAll(){
        List<User> list = userService.findAll();
        for (User user: list) {
            System.out.println(user.getName());
        }
        return "操作完成~";
    }

    @RequestMapping("/findById")
    public String findById(Integer id){
        User user = userService.findById(id);
        System.out.println(user.getName());
        return "操作完成";
    }

}
