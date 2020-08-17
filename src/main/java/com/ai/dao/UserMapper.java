package com.ai.dao;

import com.ai.pojo.User;

import java.util.List;

/**
 * @author songkang
 * @date 2020/8/17
 */
public interface UserMapper {

    List<User> selectList();

    User selectOne(User user);
}
