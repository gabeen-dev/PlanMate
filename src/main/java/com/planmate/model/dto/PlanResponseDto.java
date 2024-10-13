package com.planmate.model.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlanResponseDto {
    private Long planId;

    private String username;

    private String title;

    private String content;
}
