package com.planmate.model.entity;

import com.planmate.model.dto.CommentResponseDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    private Long commentId;

    @Column
    private String comment;

    @Column
    private String username;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updateDate;

    public CommentResponseDto toDto() {
        return CommentResponseDto.builder()
                .comment(comment)
                .username(username)
                .commentId(commentId)
                .updateDate(updateDate)
                .build();
    }
}
