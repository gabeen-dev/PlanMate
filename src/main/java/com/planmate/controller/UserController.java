package com.planmate.controller;

import com.planmate.model.dto.UserRequestDto;
import com.planmate.model.dto.UserResponseDto;
import com.planmate.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    //유저조회(단건)
    @GetMapping("/api/user/{user-id}")
    public UserResponseDto searchUser(@PathVariable("user-id") Long userId) {
        return userService.getUser(userId);
    }

    //유저생성
    @PostMapping("/api/user/")
    public UserResponseDto createUser(@Valid @RequestBody UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }

    //유저수정
    @PatchMapping("/api/user/{user-id}")
    public UserResponseDto updateUser(@PathVariable("user-id") Long userId, @RequestBody UserRequestDto userRequestDto) {
        return userService.updateUser(userId, userRequestDto);
    }

    //유저삭제
    @DeleteMapping("/api/user/")
    public void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }
}
