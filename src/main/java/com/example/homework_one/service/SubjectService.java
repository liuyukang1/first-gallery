package com.example.homework_one.service;

import com.example.homework_one.model.Subject;

import java.util.List;

/**
 * @author: lyk
 * @date: 9/16/2019
 */
public interface SubjectService {

    /**
     * 根据用户 ID 查询所有课程
     * @param userId
     * @return
     */
    List<Subject> selectByUserId(String userId);
}
