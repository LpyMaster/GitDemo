package com.lpy.controller;

import com.lpy.entity.User;
import com.lpy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
   private UserService userService;

    @RequestMapping("/show")
    public @ResponseBody List<User> getAll(){
        return userService.getAllUsers();
    }

}
