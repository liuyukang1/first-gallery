package com.example.homework_one.dto;

import com.example.homework_one.model.Subject;

import java.util.List;

/**
 * @author: lyk
 * @date: 9/16/2019
 */
public class UserDTO {
    private String id;

    private String name;

    private String password;

    private List<Subject> subjects;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
