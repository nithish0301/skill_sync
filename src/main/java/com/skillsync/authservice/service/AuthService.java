package com.skillsync.authservice.service;

import com.skillsync.authservice.model.dto.LoginRequest;
import com.skillsync.authservice.model.dto.RegisterRequest;

public interface AuthService {
    public String register (RegisterRequest request);

    public String login(LoginRequest request);
}
