package com.se.spring_boot_jwt_tranthaiminhtan.service;

import com.se.spring_boot_jwt_tranthaiminhtan.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
