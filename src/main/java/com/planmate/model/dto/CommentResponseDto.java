package com.planmate.model.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class CommentResponseDto {

    private Long commentId;

    private String content;

    private String username;

    private LocalDateTime updateDate;
}
