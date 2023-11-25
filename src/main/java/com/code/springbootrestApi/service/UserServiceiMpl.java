package com.code.springbootrestApi.service;

import com.code.springbootrestApi.entity.User;
import com.code.springbootrestApi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceiMpl implements UserService{

    UserRepository userRepository;
    @Override
    public User createUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {

      //  User existingUser = userRepository.findById(user.getId());
       return null;
    }
}
