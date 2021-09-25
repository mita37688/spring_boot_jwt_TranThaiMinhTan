package com.se.spring_boot_jwt_tranthaiminhtan.service;

import com.se.spring_boot_jwt_tranthaiminhtan.entity.Token;
import org.springframework.stereotype.Service;

@Service
public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
