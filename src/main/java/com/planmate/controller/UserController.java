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

    //유저조회(단건)
    public UserResponseDto searchUser(Long userId) {
        return userService.getUser(userId);
    }

    //유저생성
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }

    //유저수정
    public UserResponseDto updateUser(Long userId, UserRequestDto userRequestDto) {
        return userService.updateUser(userId, userRequestDto);
    }

    //유저삭제
    public void deleteUser(Long userId) {
        userService.deleteUser(userId);
    }
}
