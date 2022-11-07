package com.example.JWT_Token.service;

import com.example.JWT_Token.entity.User;
import com.example.JWT_Token.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);


        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(), Collections.EMPTY_LIST);
    }
}
