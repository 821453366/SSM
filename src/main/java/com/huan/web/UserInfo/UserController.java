package com.huan.web.UserInfo;

import com.huan.entity.User;
import com.huan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by ubuntu on 17-7-10.
 */
@Controller
@RequestMapping("userController")

public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findUser")
    public ModelAndView findUser(){
        System.out.println("======1.开始调用Service");
       List<User> UserList= userService.findUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList",UserList);
        System.out.println("========"+UserList);
        modelAndView.setViewName("UserInfo/list");
        return modelAndView;
    }
}
