package com.forge.service;

import com.forge.dto.ApiResponse;
import com.forge.dto.RegisterRequest;
import com.forge.entity.User;
import com.forge.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    
    public ApiResponse<String> register(RegisterRequest request) {

        User user = new User(
                request.name(),
                request.email(),
                passwordEncoder.encode(request.password())
        );

        userRepository.save(user);

        return new ApiResponse<>(
                true,
                "User registered successfully",
                request.email()
        );
    }
 public AuthService(UserRepository userRepository,
                   PasswordEncoder passwordEncoder) {

    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
}
    
}