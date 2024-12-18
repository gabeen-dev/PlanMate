package com.planmate.model.dto;

import com.planmate.model.entity.Plan;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class PlanRequestDto {

    private String username;

    private String title;

    private String content;

    public Plan toEntity() {
        Plan plan = Plan.builder()
                .username(username)
                .title(title)
                .content(content)
                .build();
        return plan;
    }
}
