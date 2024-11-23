package com.example.prueba.service;

import com.example.prueba.model.Task;
import com.example.prueba.repository.TaskMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskMapper taskMapper;

    public TaskService(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    public void saveTask(Task task) {
        taskMapper.insertTask(task);
    }

    public List<Task> getAllTasks() {
        return taskMapper.getAllTasks();
    }
}
