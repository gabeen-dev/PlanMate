package com.planmate.model.dto;

import com.planmate.model.entity.Users;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class UserRequestDto {

    @Size(min = 2, max = 10, message = "{글자를 2이상 10이하로 작성하세요.}")
    private String username;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "비밀번호는 최소 8자, 대문자, 소문자, 숫자, 특수문자를 포함해야 합니다.")
    private String password;

    @Email
    private String userMail;


    public Users toEntity() {
        Users users = Users.builder()
                .username(username)
                .password(password)
                .userMail(userMail)
                .createDate(LocalDateTime.now())
                .build();
        return users;
    }
}
