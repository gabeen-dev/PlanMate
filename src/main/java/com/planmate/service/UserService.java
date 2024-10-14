package com.planmate.service;

import com.planmate.model.dto.UserRequestDto;
import com.planmate.model.dto.UserResponseDto;
import com.planmate.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    //TODO : repasitory 필드

    //TODO: C, R, U, D
    //조회(단건)
    public UserResponseDto getUser(Long userId) {
        return null;
    }

    //생성
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        return null;
    }

    //수정
    public UserResponseDto updateUser(Long userId, UserRequestDto userRequestDto) {
        return null;
    }

    //삭제
    public void deleteUser(Long userId) {
    }
}
