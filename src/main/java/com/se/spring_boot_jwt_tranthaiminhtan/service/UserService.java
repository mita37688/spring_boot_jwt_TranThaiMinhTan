package com.se.spring_boot_jwt_tranthaiminhtan.service;


import com.se.spring_boot_jwt_tranthaiminhtan.authen.UserPrincipal;
import com.se.spring_boot_jwt_tranthaiminhtan.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
