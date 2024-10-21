package com.planmate.model.entity;

import com.planmate.model.dto.CommentRequestDto;
import com.planmate.model.dto.CommentResponseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends BaseEntity{

    @Id
    @GeneratedValue
    private Long commentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id")
    private Plan plan;

    @Column(name = "comment_content")
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

    public void updateComment(CommentRequestDto commentRequestDto) {
        updateDate = LocalDateTime.now();

        if (commentRequestDto.getContent() != null) {
            comment = commentRequestDto.getContent();
        }
        if (commentRequestDto.getUsername() != null) {
            username = commentRequestDto.getUsername();
        }
    }
}
