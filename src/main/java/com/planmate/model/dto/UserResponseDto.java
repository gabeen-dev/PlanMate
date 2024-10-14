package com.planmate.model.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponseDto {

    private String username;

    private String password;

    private String userMail;
}
