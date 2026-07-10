package com.forge.service;

import com.forge.dto.CreateProjectRequest;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    public String createProject(CreateProjectRequest request) {

        // Later:
        // Validate Git URL
        // Clone Repository
        // Detect Framework
        // Save to Database

        return "Project '" + request.name() + "' created successfully.";
    }
}
public ApiResponse<String> createProject(CreateProjectRequest request) {

    return new ApiResponse<>(
            true,
            "Project created successfully.",
            request.name()
    );
}