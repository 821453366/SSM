package com.huan.dao;

import com.huan.entity.User;

import java.util.List;

/**
 * Created by ubuntu on 17-7-10.
 */
public interface UserDao {
    /**
     * 通过ID查询单本图书
     *
     * @param
     * @return
     */
    List<User> findUser();
}
