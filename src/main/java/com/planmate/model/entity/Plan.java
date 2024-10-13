package com.planmate.model.entity;

import com.planmate.model.dto.PlanResponseDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
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
