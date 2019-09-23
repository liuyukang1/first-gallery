package com.example.homework_one.dao;

import com.example.homework_one.model.UserSubRela;

public interface UserSubRelaMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserSubRela record);

    int insertSelective(UserSubRela record);

    UserSubRela selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserSubRela record);

    int updateByPrimaryKey(UserSubRela record);
}