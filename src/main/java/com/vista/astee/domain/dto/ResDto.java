package com.vista.astee.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResDto {
    private final int resultCode;
    private final String errorMessage;
    private final Object document;
}