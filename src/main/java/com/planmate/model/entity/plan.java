package com.planmate.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PlanId;

    private String username;

    private String title;

    private String content;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

}
