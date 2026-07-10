package com.forge.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateProjectRequest(

    @NotBlank(message = "Project name is required")
    String name,

    @NotBlank(message = "Git repository URL is required")
    String repositoryUrl

) {}