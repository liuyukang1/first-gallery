package com.example.homework_one.dao;

import com.example.homework_one.model.Subject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectMapper {
    int deleteByPrimaryKey(String id);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(String id);

    /**
     * 根据用户 ID 查询所有课程
     * @param userId
     * @return
     */
    List<Subject> selectByUserId(String userId);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}