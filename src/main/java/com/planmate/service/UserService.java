package com.planmate.service;

import com.planmate.auth.JwtTokenProvider;
import com.planmate.auth.filter.TokenInfo;
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
    private final JwtTokenProvider jwtTokenProvider;

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
    public UserResponseDto updateUser(Long userId, UserRequestDto userRequestDto) {
        Users findUsers = userRepository.findById(userId).get();
        findUsers.updateUser(userRequestDto);
        UserResponseDto userResponseDto = findUsers.toDto();
        return userResponseDto;
    }

    //삭제
    public void deleteUser(Long userId) {
    }

    public UserResponseDto register(UserRequestDto userRequestDto) {
        Users users = userRequestDto.toEntity();
        Users save = userRepository.save(users);
        return save.toDto();
    }

    public TokenInfo login(UserRequestDto userRequestDto) {
        Users user = userRepository.findByUserMail(userRequestDto.getUserMail());
        String token = jwtTokenProvider.createToken(user);
        return TokenInfo.builder()
                .email(user.getUserMail())
                .token(token)
                .build();

    }
}
