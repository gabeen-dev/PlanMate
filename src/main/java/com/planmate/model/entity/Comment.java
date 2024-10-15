package com.planmate.model.entity;

import com.planmate.model.dto.CommentResponseDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.lang.module.ModuleDescriptor;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
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
                .content(comment)
                .username(username)
                .commentId(commentId)
                .updateDate(updateDate)
                .build();
    }
}
