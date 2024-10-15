package com.planmate.service;

import com.planmate.model.dto.CommentRequestDto;
import com.planmate.model.dto.CommentResponseDto;
import com.planmate.model.dto.UserResponseDto;
import com.planmate.model.entity.Comment;
import com.planmate.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    //TODO: repository

    //댓글 조회
    public CommentResponseDto getComment(Long commentId) {
        Comment findComment = commentRepository.findById(commentId).get();
        CommentResponseDto findDto = findComment.toDto();
        return findDto;
    }

    //댓글 생성
    public CommentResponseDto createComment(CommentRequestDto commentRequestDto) {
        return null;
    }

    //댓글 수정
    public CommentResponseDto updateComment(Long commentId, CommentRequestDto commentRequestDto) {
        return null;
    }

    //댓글 삭제
    public void deleteComment(Long commentId) {

    }
}
