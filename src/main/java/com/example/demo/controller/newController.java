package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class newController {
    @Autowired
    taskService taskService;

    @PostMapping
    public Task save (@RequestBody Task task)
    {
        return taskService.saveTo(task);

    }
    @GetMapping
    public List<Task> getAll()
    {
       return  taskService.getAll();
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        taskService.deleteById(id);
    }
    @PutMapping("/{id}")
    public Task update (@PathVariable String id, @RequestBody Task updateTask)
    {
        updateTask.setId(id);
        return taskService.saveTo(updateTask);
    }

}
