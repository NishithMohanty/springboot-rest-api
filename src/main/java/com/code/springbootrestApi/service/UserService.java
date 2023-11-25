package com.code.springbootrestApi.service;

import com.code.springbootrestApi.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    User createUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(User user);
}
