package com.planmate.service;

import com.planmate.model.dto.PlanRequestDto;
import com.planmate.model.dto.PlanResponseDto;
import com.planmate.model.entity.Plan;
import com.planmate.repository.PlanRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanService {

    private final PlanRepository planRepository;

    public Page<PlanResponseDto> searchPlan(Pageable pageable) {
        Page<Plan> plans = planRepository.findAll(pageable);
        Page<PlanResponseDto> map = plans.map(Plan::toDto);
        return map;
    }

    public PlanResponseDto getPlan(Long planId) {
        Plan findPlan = planRepository.findById(planId).get();
        PlanResponseDto findDto = findPlan.toDto();
        return findDto;
    }

    public PlanResponseDto createPlan(PlanRequestDto planRequestDto) {
        Plan plan = planRequestDto.toEntity();
        Plan savedPlan = planRepository.save(plan);
        PlanResponseDto saveDto = savedPlan.toDto();
        return saveDto;
    }

    public PlanResponseDto updatePlan(Long planId, PlanRequestDto planRequestDto) {
        Plan findPlan = planRepository.findById(planId).get();
        findPlan.updatePlan(planRequestDto);
        Plan updatedPlan = planRepository.save(findPlan);
        return updatedPlan.toDto();
    }

    public void deletePlan(Long planId) {
        planRepository.deleteById(planId);
    }
}
