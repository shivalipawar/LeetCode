package com.java.trials.Stream;

import com.java.trials.Stream.enums.TaskType;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Task {
    private final String id;
    private final String title;
    private final TaskType taskType;
    private final LocalDate createdOn;
    private boolean done = false;
    private Set<String> tags = new HashSet<>();
    private LocalDate dueOn;

    public Task(String id, String title, TaskType taskType, LocalDate createdOn) {
        this.id = id;
        this.title = title;
        this.taskType = taskType;
        this.createdOn = createdOn;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void addTag(String tags) {
        this.tags.add(tags);
    }

    public Set<String> getTags() {
        return tags;
    }

}
