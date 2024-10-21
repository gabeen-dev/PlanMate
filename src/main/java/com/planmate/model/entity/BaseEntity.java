package com.planmate.model.entity;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public abstract class BaseEntity {

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updateDate;

}
