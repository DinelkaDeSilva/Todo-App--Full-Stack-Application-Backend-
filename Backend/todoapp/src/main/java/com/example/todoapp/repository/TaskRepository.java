package com.example.todoapp.repository;


import com.example.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Find top 5 incomplete tasks ordered by creation date (newest first)
    @Query("SELECT t FROM Task t WHERE t.completed = false ORDER BY t.createdAt DESC")
    List<Task> findTop5IncompleteTasksOrderByCreatedAtDesc();

    // Alternative using method query
    List<Task> findTop5ByCompletedFalseOrderByCreatedAtDesc();

    // Count incomplete tasks
    long countByCompletedFalse();
}