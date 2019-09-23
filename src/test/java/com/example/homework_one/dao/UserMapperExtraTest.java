package com.example.homework_one.dao;

import com.example.homework_one.dto.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: lyk
 * @date: 9/17/2019
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperExtraTest {

    @Autowired
    UserMapperExtra userMapperExtra;

    @Test
    public void test1() {
        UserDTO userDTO = userMapperExtra.selectByPrimaryKey("1");
        System.out.println();
    }

}