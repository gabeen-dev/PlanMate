package com.planmate.model.entity;

import com.planmate.model.dto.UserResponseDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String userMail;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updateDate;

    public UserResponseDto toDto() {
        return UserResponseDto.builder()
                .username(username)
                .password(password)
                .userMail(userMail)
                .build();
    }
}