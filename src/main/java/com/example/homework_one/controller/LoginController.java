package com.example.homework_one.controller;

import com.example.homework_one.entity.Person;
import com.example.homework_one.service.UserService;
import global.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lyk
 * @date: 9/13/2019
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public JSONResult login(Person person) {
        JSONResult jsonResult;

        // 初步判断是否为 cookie 登陆
        if (person.getName() != null && person.getPassword() != null)
            jsonResult = userService.loginByPassWord(person.getName(), person.getPassword());
        else if (person.getToken() != null
                && (person.getName() == null && person.getPassword() == null))
            jsonResult = userService.loginByCookie(person.getToken());
        else
            jsonResult = new JSONResult("请输入用户名及密码", 400);

        return jsonResult;
    }
}
