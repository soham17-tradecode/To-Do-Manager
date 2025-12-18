package com.example.demo.controller;

import com.example.demo.model.Priority;
import com.example.demo.model.category;
import com.example.demo.model.Task;
import com.example.demo.service.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@RestController
@Controller
public class toDoListController {
    @Autowired
    taskService taskService;


//    ArrayList<Task> getAllatsk = new ArrayList<>(List.of(new Task(
//            1,
//            "going to mandir",
//            "pk",
//            LocalDateTime.now(),
//            Priority.HIGH,
//            category.personal,
//            true,
//            LocalDateTime.now())));

//    @GetMapping("/get")
//    public List<Task> getAll() {
//        return taskService.getAll();
//
//    }
//    @PostMapping("/save")
//    public void save(@RequestBody Task task)
//    {
//
//        taskService.saveTo(task);
//    }
//    @DeleteMapping("{id}")
//    public void deleteById(@PathVariable String id)
//    {
//        taskService.deleteById(id);
//
//    }
//    @GetMapping("{id}")
//    public Task findById(@PathVariable String id)
//    {
//       return taskService.getById(id).orElse(null);
//
//    }
//    @PutMapping("{id}")
//    public Task updateById(@PathVariable String id,@RequestBody Task newEntry)
//    {
//        Task byId = taskService.getById(id).orElse(null);
//        if (byId!=null)
//        {
//            byId.setTitle(newEntry.getTitle()!=null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : byId.getTitle());
//            byId.setDescription(newEntry.getDescription()!=null && !newEntry.getDescription().equals("") ? newEntry.getDescription() : byId.getDescription());
//
//
//        }
//        taskService.saveTo(byId);
//        return byId;
//
//
//
//    }

    @GetMapping("/")
    public String getPage(Model model) {
        Task ts =new Task();


        model.addAttribute("do", ts);

        return "todo";
    }



    @PostMapping("/registerUse")
    public String registerUse(@ModelAttribute("do") Task task) {
        taskService.saveTo(task);
        System.out.println(task);
        return "done";
    }
    








}
