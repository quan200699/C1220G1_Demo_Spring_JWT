package com.example.demojwt.service.user;

import com.example.demojwt.model.User;
import com.example.demojwt.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User findByUsername(String username);
}
