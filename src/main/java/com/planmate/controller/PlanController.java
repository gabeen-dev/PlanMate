package com.planmate.controller;

import com.planmate.model.dto.PlanRequestDto;
import com.planmate.model.dto.PlanResponseDto;
import com.planmate.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PlanController {

    private final PlanService planService;

    // TODO : c, r, u, d
    // 일정조회(다건)
    @GetMapping("/api/plan/search")
    public Page<PlanResponseDto> searchPlan(Pageable pageable) {
        return planService.searchPlan(pageable);
    }

    //일정조회(단건)
    @GetMapping("/api/plan/{plan-id}")
    public PlanResponseDto getPlan(@PathVariable("plan-id") Long planId) {
        return planService.getPlan(planId);
    }

    //일정 생성
    @PostMapping("/api/plan")
    public PlanResponseDto createPlan(@RequestBody PlanRequestDto planRequestDto) {
        return planService.createPlan(planRequestDto);
    }

    //일정 수정
    @PatchMapping("/api/plan/{plan-id}")
    public PlanResponseDto updatePlan(@PathVariable("plan-id") Long planId, @RequestBody PlanRequestDto planRequestDto) {
        return planService.updatePlan(planId, planRequestDto);
    }

    //일정 삭제
    @DeleteMapping("api/plan/{plan-id}")
    public void deletePlan(@PathVariable("plan-id") Long planId) {
        planService.deletePlan(planId);
    }
}
