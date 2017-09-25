package com.huan.dao;

import com.huan.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.validation.annotation.Validated;

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

    void insertUser(@Param("User")User user, @Param("img")String img);
}
