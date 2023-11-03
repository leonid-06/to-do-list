package com.example.todolist.controller;

import com.example.todolist.model.Task;
import com.example.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FirstController {

    private final TaskService taskService;

    @Autowired
    public FirstController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping()
    public String home(){
        return "home";
    }

    @GetMapping("/alltask")
    public String allTask(Model model){
        List<Task> tasks = taskService.getAll();
        model.addAttribute("tasks", tasks);
        return "alltask";
    }

    @GetMapping("/addTask")
    public String addTaskForm(Model model){
        model.addAttribute("task", new Task());
        return "addTask";
    }

    @PostMapping("/addTask")
    public String addTask(@ModelAttribute ("task") Task task){
        taskService.addTask(task);
        return "redirect:/allTask";
    }


}
