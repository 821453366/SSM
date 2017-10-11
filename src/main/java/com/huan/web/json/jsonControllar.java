package com.huan.web.json;


import com.huan.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/json")
public class jsonControllar {
    //将接受过来的json对象处理完，转为json返回
    @RequestMapping("/requestJson")
    public @ResponseBody User requestJson(@RequestBody User user){

        return user;
    }

    @RequestMapping("/responseJson")
    public @ResponseBody User responseJson(User user){

        return user;
    }
}
