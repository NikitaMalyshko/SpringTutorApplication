package com.example.tutor.model;


public class Task {
    private Integer id;
    private String title;
    private Boolean completed;

    public Task() {
    }

    public Task(Integer id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Integer getId() { return id; }
    public String getTitle() { return title; }
    public Boolean getCompleted() { return completed; }

    public void setId(Integer id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}