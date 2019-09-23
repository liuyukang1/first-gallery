package com.example.homework_one.dao;

import com.example.homework_one.model.Subject;
import com.example.homework_one.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User getUserById(String id);

    /**
     * 根据用户 ID 查询所有课程
     * @param subId
     * @return
     */
    List<User> selectBySubId(String subId);

    User selectByName(String name);

    boolean insert(User record);

    boolean insertSelective(User record);
}