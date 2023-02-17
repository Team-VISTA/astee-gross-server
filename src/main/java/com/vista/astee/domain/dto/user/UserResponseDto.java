package com.vista.astee.domain.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
public class UserResponseDto {
    private String id;
    private String username;
    private String email;
}
