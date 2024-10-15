package com.planmate.model.dto;

import com.planmate.model.entity.User;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class UserRequestDto {

    private String username;

    private String password;

    private String userMail;

    private LocalDateTime createDate;

    public User toEntity() {
        User user = User.builder()
                .username(username)
                .password(password)
                .userMail(userMail)
                .createDate(createDate)
                .build();
        return user;
    }
}
