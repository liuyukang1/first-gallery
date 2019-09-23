package com.example.homework_one.dao;

import com.example.homework_one.model.Subject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lyk
 * @date: 9/16/2019
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserSubRelaMapperExtraTest {

    @Autowired
    UserSubRelaMapperExtra userSubRelaMapperExtra;

    @Autowired
    SubjectMapperExtra subjectMapperExtra;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void find() {
        List<String> subList = new ArrayList<>();
        subList.add("1");
        subList.add("2");
        subList.add("3");
        ArrayList<Subject> list = (ArrayList<Subject>) subjectMapperExtra.selectBySubIds(null);
        System.out.println();

        Subject subject = new Subject();
        subject.setName("语文");
        list = (ArrayList<Subject>) subjectMapperExtra.selectByAttributes(subject);
        System.out.println();
    }
}