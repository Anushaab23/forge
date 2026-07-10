package com.forge.dto;

public record ApiResponse<T>(
        boolean success,
        String message,
        T data
) {}