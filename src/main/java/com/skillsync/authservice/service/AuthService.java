package com.skillsync.authservice.service;

import com.skillsync.authservice.model.RegisterRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public interface AuthService {
    public String register (RegisterRequest request);
}
