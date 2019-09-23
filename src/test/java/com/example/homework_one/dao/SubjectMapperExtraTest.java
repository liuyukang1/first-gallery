package com.example.homework_one.dao;

import com.example.homework_one.dto.SubjectDTO;
import com.example.homework_one.model.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author: lyk
 * @date: 9/17/2019
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectMapperExtraTest {

    @Autowired
    private SubjectMapperExtra subjectMapperExtra;

    @Test
    public void test1() {


        ArrayList<SubjectDTO> a = (ArrayList<SubjectDTO>) subjectMapperExtra.selectByPrimaryKey("1");

        System.out.println();
    }

}