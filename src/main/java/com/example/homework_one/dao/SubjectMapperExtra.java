package com.example.homework_one.dao;

import com.example.homework_one.dto.SubjectDTO;
import com.example.homework_one.model.Subject;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectMapperExtra {

    /**
     * 用 ID 删除 subject
     * @param id
     * @return
     */
    boolean deleteByPrimaryKey(String id);

    boolean insert(Subject record);

    boolean insertSelective(Subject record);

    /**
     * 以课程 ID 查询相关信息包括所有学生
     * @param id
     * @return
     */
    List<SubjectDTO> selectByPrimaryKey(String id);

    /**
     * 根据一个 ID 列表查询所有对应 subject
     * @param subList
     * @return
     */
    List<Subject> selectBySubIds(@Param("subList") List<String> subList);

    /**
     * 根据用户 ID 查询所有课程
     * @param userId
     * @return
     */
    List<Subject> selectByUserId(String userId);

    /**
     * 根据 subject 属性查找对应的 subject 列表
     * @param subject
     * @return
     */
    List<Subject> selectByAttributes(Subject subject);


    boolean updateByPrimaryKeySelective(Subject record);

    boolean updateByPrimaryKey(Subject record);


}