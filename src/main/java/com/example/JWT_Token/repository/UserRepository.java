package com.example.JWT_Token.repository;

import com.example.JWT_Token.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String username);
}
