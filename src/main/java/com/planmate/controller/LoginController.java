package com.planmate.controller;

import com.planmate.auth.filter.TokenInfo;
import com.planmate.model.dto.UserRequestDto;
import com.planmate.model.dto.UserResponseDto;
import com.planmate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class LoginController {

    private final UserService userService;

    //회원가입
    @PostMapping("/auth/register")
    public UserResponseDto register(@RequestBody UserRequestDto userRequestDto) {
        return userService.register(userRequestDto);
    }

    //로그인
    @PostMapping("/auth/login")
    public TokenInfo login(@RequestBody UserRequestDto userRequestDto) {
        return userService.login(userRequestDto);
    }

}