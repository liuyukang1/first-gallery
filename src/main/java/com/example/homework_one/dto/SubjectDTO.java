package com.example.homework_one.dto;

import com.example.homework_one.model.User;

import java.util.List;

/**
 * @author: lyk
 * @date: 9/17/2019
 */
public class SubjectDTO {

    private String id;

    private String name;

    private Integer period;

    private Integer credit;

    private List<User> users;

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

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
