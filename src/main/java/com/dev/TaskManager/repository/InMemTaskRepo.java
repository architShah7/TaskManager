package com.dev.TaskManager.repository;

import com.dev.TaskManager.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InMemTaskRepo implements TaskRepository {
    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Task> getAll() {
        return this.tasks;
    }

    @Override
    public Task findById(Long id) {
        return tasks.stream().filter(task -> Objects.equals(task.getId(), id)).findFirst().orElse(null);
    }

    @Override
    public Task save(Task t) {
        if (t.getId() == null) {
            t.setId(nextId++);
        }
        tasks.add(t);
        return t;
    }

    @Override
    public void deleteById(Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
}
