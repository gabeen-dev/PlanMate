package com.planmate.model.dto;

import com.planmate.model.entity.Comment;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentRequestDto {

    private String content;

    private String username;

    public Comment toEntity() {
        Comment comment = Comment.builder()
                .comment(this.content)
                .username(this.username)
                .createDate(LocalDateTime.now())
                .build();
        return comment;
    }
}
