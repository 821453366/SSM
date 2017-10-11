package com.huan.service.impl;

import com.huan.dao.UserDao;
import com.huan.entity.User;
import com.huan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ubuntu on 17-7-10.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUser() {
        return userDao.findUser();
    }
    public List<User> findUserById(int id) {
        return userDao.findUserById( id);
    }

    @Override
    public void insertUser(User user,String img) {
        userDao.insertUser(user,img);
    }
}
