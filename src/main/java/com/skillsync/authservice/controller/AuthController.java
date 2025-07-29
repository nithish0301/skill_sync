package com.skillsync.authservice.controller;


import com.skillsync.authservice.model.dto.LoginRequest;
import com.skillsync.authservice.model.dto.LoginResponse;
import com.skillsync.authservice.model.dto.RegisterRequest;
import com.skillsync.authservice.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
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

    @PreAuthorize("hasRole('STUDENT')")
    @GetMapping("/ping")
    public String ping (Authentication authentication) {
        System.out.println("Authenticated user: " + authentication.getName());

        System.out.println("Authorities: " + authentication.getAuthorities());
        return "pong";
    }

    @PreAuthorize("hasRole('INSTRUCTOR')")
    @GetMapping("/pinginstructor")
    public String pinginstructotr(){
        return "pong from instructor";
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.login(loginRequest));
    }
}
