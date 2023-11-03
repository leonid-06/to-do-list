package com.example.todolist.controller;

import com.example.todolist.model.Task;
import com.example.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class FirstRestController {

    private final TaskService taskService;

    @Autowired
    public FirstRestController(TaskService taskService) {
        this.taskService = taskService;
    }

    @DeleteMapping("/deleteTask/{id}")
    public ResponseEntity<?> delete(@PathVariable int id ){
        Optional<Task> optionalTask = taskService.getById(id);
        optionalTask.ifPresent(taskService::deleteTask);
        System.out.println("------------");
        return ResponseEntity.ok("ok");
    }

    @PutMapping("/updateTaskStatus/{id}")
    public ResponseEntity<?> updateStatus(@PathVariable int id){
        taskService.updateStatus(id);
        return ResponseEntity.ok("dl");
    }
}
