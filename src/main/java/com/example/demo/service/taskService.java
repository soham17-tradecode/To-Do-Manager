package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repo.taskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class taskService {





    @Autowired
    taskRepo taskRepo;


    public List<Task> getAll()
    {
        return  taskRepo.findAll();
    }
    public Task saveTo(Task task)
    {
//        task.setDuedate(LocalDateTime.now());
//        task.setCreateat(LocalDateTime.now());

       return  taskRepo.save(task);
    }
    public void deleteById(String id)
    {
        taskRepo.deleteById(id);
    }
    public Optional<Task> getById(String id)
    {
        return taskRepo.findById(id);
    }

    public Optional<Task> updateById(Task id)
    {
        taskRepo.save(id);

        return null;
    }



}
