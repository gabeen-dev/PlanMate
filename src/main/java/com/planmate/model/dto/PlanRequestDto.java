package com.planmate.model.dto;

import com.planmate.model.entity.Plan;
import jakarta.persistence.Column;
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
                .createDate(LocalDateTime.now())
                .build();
        return plan;
    }
}
