package com.example.prueba.repository;

import com.example.prueba.model.Task;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskMapper {
    void insertTask(Task task);
    List<Task> getAllTasks();
}
