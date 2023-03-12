package com.vista.astee.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponseDto {
    private String id;
    private String username;
    private String email;
}
