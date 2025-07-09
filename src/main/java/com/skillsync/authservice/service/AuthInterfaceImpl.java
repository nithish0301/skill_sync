package com.skillsync.authservice.service;
import com.skillsync.authservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import com.skillsync.authservice.model.Role;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.skillsync.authservice.model.RegisterRequest;
import com.skillsync.authservice.model.User;
import org.springframework.stereotype.Service;


@Service

public class AuthInterfaceImpl implements AuthService {




    private  final UserRepository userRepository;
    private  final PasswordEncoder passwordEncoder;

    public AuthInterfaceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }



    public String register (RegisterRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(request.getRole());
        userRepository.save(user);
        return "User registered successfully";

    }
}
