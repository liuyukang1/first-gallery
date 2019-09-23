package com.example.homework_one.service.serviceImpl;

import com.example.homework_one.dao.SubjectMapperExtra;
import com.example.homework_one.dao.UserMapper;
import com.example.homework_one.dao.UserMapperExtra;
import com.example.homework_one.dao.UserSubRelaMapperExtra;
import com.example.homework_one.model.Subject;
import com.example.homework_one.service.SubjectService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: lyk
 * @date: 9/16/2019
 */

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectMapperExtra subjectMapperExtra;

    @Override
    public List<Subject> selectByUserId(String userId) {

        List<Subject> subjects = subjectMapperExtra.selectByUserId(userId);

        return subjects;
    }
}
