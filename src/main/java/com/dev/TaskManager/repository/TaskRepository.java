package com.dev.TaskManager.repository;

import com.dev.TaskManager.model.Task;
import java.util.List;
public interface TaskRepository {

    List<Task> getAll();
    Task findById(Long id);
    Task  save(Task t);
    void deleteById(Long id);
}
