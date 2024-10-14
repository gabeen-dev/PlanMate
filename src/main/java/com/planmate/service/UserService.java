package com.planmate.service;

import com.planmate.model.dto.UserRequestDto;
import com.planmate.model.dto.UserResponseDto;
import com.planmate.model.entity.User;
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
        User findUser = userRepository.findById(userId).get();
        UserResponseDto userResponseDto = findUser.toDto();
        return userResponseDto;
    }

    //생성
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = userRequestDto.toEntity();
        User savedUser = userRepository.save(user);
        UserResponseDto userResponseDto = savedUser.toDto();
        return userResponseDto;
    }

    //수정
    public UserResponseDto updateUser(Long userId, UserRequestDto userRequestDto){
        User findUser = userRepository.findById(userId).get();
        findUser.updateUser(userRequestDto);
        UserResponseDto userResponseDto = findUser.toDto();
        return userResponseDto;
    }

    //삭제
    public void deleteUser(Long userId) {
    }
}
