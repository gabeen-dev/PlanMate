package com.planmate.model.entity;

import com.planmate.model.dto.PlanRequestDto;
import com.planmate.model.dto.PlanResponseDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

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

    public void updatePlan(PlanRequestDto planRequestDto) {
        updateDate = LocalDateTime.now();

        if (planRequestDto.getUsername() != null) {
            this.username = planRequestDto.getUsername();
        }
        if (planRequestDto.getTitle() != null) {
            this.title = planRequestDto.getTitle();
        }
        if (planRequestDto.getContent() != null) {
            this.content = planRequestDto.getContent();
        }
    }
}
