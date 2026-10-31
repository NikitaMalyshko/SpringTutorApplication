package com.example.tutor.service;

import com.example.tutor.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getAll() { return tasks; }

    public Task getTaskById(Integer id) {
        return tasks.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }

    public void addTask(Task t) { tasks.add(t); }

    public boolean deleteTask(Integer id) {
        return tasks.removeIf(t -> t.getId().equals(id));
    }
}