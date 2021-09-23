package com.se.spring_boot_jwt_tranthaiminhtan.repository;

import com.se.spring_boot_jwt_tranthaiminhtan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
