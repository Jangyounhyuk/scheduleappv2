package com.example.scheduleappdevelop.dto.response;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {

    private final Long id;
    private final String title;
    private final String todo;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public ScheduleResponseDto(Long id, String title, String todo, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.todo = todo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}
