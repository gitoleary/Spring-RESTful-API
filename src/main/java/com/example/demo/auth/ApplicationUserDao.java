package com.example.demo.auth;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface ApplicationUserDao {

    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
