package com.planmate.controller;

import com.planmate.model.dto.UserRequestDto;
import com.planmate.model.dto.UserResponseDto;
import com.planmate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    //유저조회
    public UserResponseDto searchUser(Long UserId) {
        return null;
    }

    //유저생성
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        return null;
    }

    //유저수정
    public UserResponseDto updateUser(UserRequestDto userRequestDto) {
        return null;
    }

    //유저삭제
    public void deleteUser(Long UserId) {

    }
}
