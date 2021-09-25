package com.se.spring_boot_jwt_tranthaiminhtan.repository;


import com.se.spring_boot_jwt_tranthaiminhtan.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
