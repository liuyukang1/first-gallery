package com.example.homework_one.dao;

import com.example.homework_one.model.UserSubRela;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: lyk
 * @date: 9/16/2019
 */
@Repository
public interface UserSubRelaMapperExtra {

    boolean deleteByPrimaryKey(String id);

    boolean insert(UserSubRela record);

    boolean insertSelective(UserSubRela record);

    UserSubRela selectByPrimaryKey(String id);

    <T>List selectSubIdByUserId(String userId);

    boolean updateByPrimaryKeySelective(UserSubRela record);

    boolean updateByPrimaryKey(UserSubRela record);

    /**
     * 根据 userId 删除所有相关记录
     * @param userList
     * @return
     */
    boolean deleteByUserId(List<String> userList);
}
