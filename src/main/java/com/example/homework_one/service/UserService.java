package com.example.homework_one.service;

import com.example.homework_one.dto.UserDTO;
import com.example.homework_one.model.Token;
import com.example.homework_one.model.User;
import global.JSONResult;

/**
 * @author: lyk
 * @date: 9/14/2019
 */
public interface UserService {
    User getUserById(String id);

    /**
     * 以用户 ID 查询相关信息包括选课信息
     * @param id
     * @return
     */
    UserDTO selectByPrimaryKey(String id);

    /**
     * 以 token 登陆
     * @param token
     * @return
     */
    JSONResult<String> loginByCookie(String token);

    /**
     * 以用户名密码登陆
     * @param name
     * @param password
     * @return
     */
    JSONResult<String> loginByPassWord(String name, String password);

    /**
     * 以时间戳的方式生成 token
     * @return
     */
    String createRandomString();


    /**
     * 对即将插入数据库的 token 进行处理
     * @return
     */
    String dealTheToken(String userId);

    /**
     * 删除用户数据
     * @param name
     * @return
     */
    boolean deleteByName(String name);

    /**
     * 新增用户信息
     * @param record
     * @return
     */
    boolean insert(User record);
}
