package com.example.homework_one.dao;

import com.example.homework_one.dto.UserDTO;
import com.example.homework_one.model.User;
import org.springframework.stereotype.Repository;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * @author: lyk
 * @date: 9/16/2019
 */
@Repository
public interface UserMapperExtra {
    User getUserById(String id);

    User selectByName(String name);

    /**
     * 以用户 ID 查询相关信息包括选课信息
     * @param id
     * @return
     */
    UserDTO selectByPrimaryKey(String id);

    /**
     * 根据用户名查询用户信息
     * @param name
     * @return
     */
    List<UserDTO> selectIdByName(String name);

    /**
     * 根据 userName 删除所有相关记录(包括所有选课信息)
     * @param name
     * @return
     */
    boolean deleteByName(String name);

    /**
     * 新增用户信息
     * @param record
     * @return
     */
    boolean insert(User record);

    boolean insertSelective(User record);
}
