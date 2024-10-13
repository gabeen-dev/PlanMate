package com.planmate.controller;

import com.planmate.service.CommentSercvice;
import com.planmate.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentSercvice commentSercvice;
}
