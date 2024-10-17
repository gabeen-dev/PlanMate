package com.planmate.service;

import com.planmate.model.dto.UserRequestDto;
import com.planmate.model.dto.UserResponseDto;
import com.planmate.model.entity.Users;
import com.planmate.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    //TODO: C, R, U, D
    //조회(단건)
    public UserResponseDto getUser(Long userId) {
        Users findUsers = userRepository.findById(userId).get();
        UserResponseDto userResponseDto = findUsers.toDto();
        return userResponseDto;
    }

    //생성
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        Users users = userRequestDto.toEntity();
        Users savedUsers = userRepository.save(users);
        UserResponseDto userResponseDto = savedUsers.toDto();
        return userResponseDto;
    }

    //수정
    public UserResponseDto updateUser(Long userId, UserRequestDto userRequestDto){
        Users findUsers = userRepository.findById(userId).get();
        findUsers.updateUser(userRequestDto);
        UserResponseDto userResponseDto = findUsers.toDto();
        return userResponseDto;
    }

    //삭제
    public void deleteUser(Long userId) {
    }
}
