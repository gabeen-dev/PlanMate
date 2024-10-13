package com.planmate.model.entity;

import com.planmate.model.dto.PlanResponseDto;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;

    @Column
    private String username;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updateDate;

    public PlanResponseDto toDto() {
        return PlanResponseDto.builder()
                .planId(this.planId)
                .username(this.username)
                .title(this.title)
                .content(this.content)
                .build();
    }
}
