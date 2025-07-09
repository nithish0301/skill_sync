package com.skillsync.authservice.controller;


import com.skillsync.authservice.model.RegisterRequest;
import com.skillsync.authservice.service.AuthService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")

public class AuthController {

    public AuthController(AuthService authService) {
        this.authService = authService;
    }


    private final AuthService authService;
    @PostMapping("/register")
    public ResponseEntity<String> register (@RequestBody RegisterRequest registerRequest) {
        return ResponseEntity.ok(authService.register(registerRequest));
    }

    @GetMapping("/ping")
    public String ping () {
        return "pong";
    }
}
