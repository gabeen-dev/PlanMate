package com.planmate.controller;

import com.planmate.model.dto.CommentRequestDto;
import com.planmate.model.dto.CommentResponseDto;
import com.planmate.service.CommentSercvice;
import com.planmate.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentSercvice commentSercvice;

    //TODO : comment CRUD
    //댓글 조회
    public CommentResponseDto getComment(Long commentId) {
        return null;
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
