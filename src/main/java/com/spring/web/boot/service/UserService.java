package com.spring.web.boot.service;


import com.spring.web.boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}