package com.example.tutor.controllers;

import com.example.tutor.model.Task;
import com.example.tutor.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> index() {
        return taskService.getAll();
    }

    @PostMapping("/create")
    public void create() {
        taskService.addTask(new Task(1, "Первая задача", false));
    }

    @DeleteMapping("/{id}")
    public void destroy(@PathVariable Integer id) {
        taskService.deleteTask(id);
    }
}