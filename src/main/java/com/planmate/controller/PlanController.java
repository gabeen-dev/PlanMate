package com.planmate.controller;

import com.planmate.model.dto.PlanRequestDto;
import com.planmate.model.dto.PlanResponseDto;
import com.planmate.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PlanController {

    private final PlanService planService;

    // TODO : c, r, u, d
    // 일정조회(다건)
    public Page<PlanResponseDto> searchPlan(PlanRequestDto planRequestDto) {
        return planService.searchPlan(planRequestDto);
    }

    //일정조회(단건)
    public PlanResponseDto getPlan(Long planId) {
        return planService.getPlan(planId);
    }

    //일정 생성
    public PlanResponseDto createPlan(PlanRequestDto planRequestDto) {
        return planService.createPlan(planRequestDto);
    }

    //일정 수정
    public PlanResponseDto updatePlan(Long planId, PlanRequestDto planRequestDto) {
        return planService.updatePlan(planId, planRequestDto);
    }

    //일정 삭제
    public void deletePlan(Long planId) {
        planService.deletePlan(planId);
    }


}
