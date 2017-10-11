package com.huan.web.UserInfo;

import com.huan.entity.CustomException;
import com.huan.entity.Img;
import com.huan.entity.User;
import com.huan.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Created by ubuntu on 17-7-10.
 */
@Controller
@RequestMapping("userController")

public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("findUser")
    public ModelAndView findUser(){
       List<User> UserList= userService.findUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList",UserList);
        modelAndView.setViewName("UserInfo/list");
        return modelAndView;
    }

//    @RequestMapping("insertUser")
//    public String insertUser (@Validated User user, BindingResult bindingResult){
//        System.out.println(user.toString());
//        //获取校验错误信息
//        if(bindingResult.hasErrors()){
//            List<ObjectError> allErrors = bindingResult.getAllErrors();
//            for(ObjectError objectError:allErrors){
//                //输出错误信息
//                System.out.println(objectError.getDefaultMessage());
//            }
//            return "UserInfo/login1";
//        }
//        userService.insertUser(user);
//        return "item/success";
//    }

    @RequestMapping("insertUser")
    public String insertUser (HttpServletRequest request, User user, MultipartFile imgFile) throws IOException {
        //获取文件原始名称
        String originalFilename = imgFile.getOriginalFilename();
        //上传图片
        if(imgFile!=null && originalFilename!=null && originalFilename.length()>0){
            //存储图片的物理路径
            String pic_path = "/home/ubuntu/IDEA/SSM/img/";
            //新的图片名称
            String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
            //新图片
            File newFile = new File(pic_path+newFileName);
            //将内存中的数据写入磁盘
            imgFile.transferTo(newFile);
            userService.insertUser(user,newFileName);
            HttpSession session = request.getSession();
            session.setAttribute("imgUrl", newFileName);
        }

        return "item/success";
    }
    public List<User> findItemsById(Integer id) throws Exception {
        List<User> UserList= userService.findUser();
        if(UserList==null){
            throw new CustomException("用户为空!");
        }

        return UserList;
    }

    @RequestMapping("/itemsView/{id}")
    public @ResponseBody List<User> itemsView(@PathVariable("id") Integer id)throws Exception{
        //调用service查询商品信息
        List<User> user = userService.findUserById(id);
        return user;

    }
}
