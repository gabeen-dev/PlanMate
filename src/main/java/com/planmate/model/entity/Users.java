package com.planmate.model.entity;

import com.planmate.model.dto.UserRequestDto;
import com.planmate.model.dto.UserResponseDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;

    @OneToMany(mappedBy = "users")
    private List<Plan> plans = new ArrayList<>();

    @OneToMany(mappedBy = "users")
    private List<Comment> comments = new ArrayList<>();

    @Column
    private String username;

    @Column
    private String password;

    @Column(name = "email")
    private String userMail;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updateDate;

    public UserResponseDto toDto() {
        return UserResponseDto.builder()
                .userId(userid)
                .username(username)
                .userMail(userMail)
                .build();
    }

    public void updateUser(UserRequestDto userRequestDto) {
        updateDate = LocalDateTime.now();

        if (userRequestDto.getPassword() != null) {
            this.password = userRequestDto.getPassword();
        }
        if (userRequestDto.getUsername() != null) {
            this.username = userRequestDto.getUsername();
        }
    }
}