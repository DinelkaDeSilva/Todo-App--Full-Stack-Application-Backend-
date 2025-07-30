package com.example.todoapp.service;



import com.example.todoapp.dto.TaskRequestDto;
import com.example.todoapp.dto.TaskResponseDto;

import java.util.List;

public interface TaskService {
    TaskResponseDto createTask(TaskRequestDto taskRequestDto);
    List<TaskResponseDto> getRecentTasks();
    TaskResponseDto markTaskAsCompleted(Long taskId);
    void deleteTask(Long taskId);
}