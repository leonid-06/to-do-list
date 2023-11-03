package com.example.todolist.service;

import com.example.todolist.model.Task;
import com.example.todolist.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepo taskRepo;

    @Autowired
    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public void addTask(Task task){
        task.setCreated(LocalDateTime.now());
        task.setUpdated(LocalDateTime.now());
        taskRepo.save(task);
    }

    public List<Task> getAll(){
        return taskRepo.findAll();
    }

    public Optional<Task> getById(int id){
        return taskRepo.findById(id);
    }

    public void deleteTask(Task task){
        taskRepo.delete(task);
    }

    public void updateStatus(int id){
        Optional<Task> optionalTask = taskRepo.findById(id);

        if (optionalTask.isPresent()){
            Task task = optionalTask.get();
            task.setStatus(!task.isStatus());
            taskRepo.save(task);
        }
    }
}
