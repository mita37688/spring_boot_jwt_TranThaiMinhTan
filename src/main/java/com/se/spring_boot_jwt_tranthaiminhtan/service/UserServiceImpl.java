package com.se.spring_boot_jwt_tranthaiminhtan.service;

import com.se.spring_boot_jwt_tranthaiminhtan.entity.User;
import com.se.spring_boot_jwt_tranthaiminhtan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }
}
