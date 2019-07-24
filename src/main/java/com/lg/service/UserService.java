package com.lg.service;

import com.lg.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Integer id);
}
