package com.andymartinez1.todo.service;

import com.andymartinez1.todo.dto.LoginDto;
import com.andymartinez1.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}
