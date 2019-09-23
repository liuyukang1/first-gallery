package com.example.homework_one.controller;

import com.example.homework_one.dto.UserDTO;
import com.example.homework_one.model.User;
import com.example.homework_one.service.UserService;
import global.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lyk
 * @date: 9/18/2019
 */
@RestController
public class UserMessageController {

    @Autowired
    private UserService userService;

    /**
     * 通过学生 id 查询学生所有基础信息
     * @param id
     * @return
     */
    @RequestMapping("userMessage")
    public JSONResult selectByPrimaryKey(String id) {

        JSONResult jsonResult;
        UserDTO userDTO = userService.selectByPrimaryKey(id);
        if (userDTO == null)
            jsonResult = new JSONResult("服务器繁忙", 500);
        else
            jsonResult = new JSONResult("查询成功", 200, userDTO);

        return jsonResult;
    }

    @RequestMapping("deleteUser")
    public JSONResult deleteByName(String name) {
        JSONResult jsonResult;
        if(userService.deleteByName(name))
            jsonResult = new JSONResult("删除成功", 200, true);
        else
            jsonResult = new JSONResult("服务器繁忙", 500);
        return jsonResult;
    }

    @RequestMapping("addUser")
    public JSONResult addUser(User record) {
        JSONResult jsonResult;
        if(userService.insert(record))
            jsonResult = new JSONResult("新增成功", 200, true);
        else
            jsonResult = new JSONResult("服务器繁忙", 500);
        return jsonResult;
    }
}
