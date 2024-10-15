package com.planmate.controller;

import com.planmate.model.dto.CommentRequestDto;
import com.planmate.model.dto.CommentResponseDto;
import com.planmate.service.CommentService;
import com.planmate.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    //TODO : comment CRUD
    //댓글 조회
    @GetMapping("/api/comment/{plan-id}")
    public CommentResponseDto getComment(@PathVariable("plan-id") Long commentId) {
        return commentService.getComment(commentId);
    }

    //댓글 생성
    @PostMapping("/api/comment/")
    public CommentResponseDto createComment(@RequestBody CommentRequestDto commentRequestDto) {
        return commentService.createComment(commentRequestDto);
    }

    //댓글 수정
    @PatchMapping("/api/comment/{plan-id}")
    public CommentResponseDto updateComment(@PathVariable("plan-id") Long commentId, @RequestBody CommentRequestDto commentRequestDto) {
        return commentService.updateComment(commentId, commentRequestDto);
    }

    //댓글 삭제
    @DeleteMapping("/api/comment/{plan-id}")
    public void deleteComment(@PathVariable("plan-id") Long commentId) {
        commentService.deleteComment(commentId);
    }
}
