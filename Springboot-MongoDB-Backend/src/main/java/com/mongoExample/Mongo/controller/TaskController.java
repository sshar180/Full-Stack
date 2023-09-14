package com.mongoExample.Mongo.controller;

import com.mongoExample.Mongo.model.Task;
import com.mongoExample.Mongo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService ts;

    @PostMapping
    @RequestMapping("/savetask")
    public String save(@RequestBody Task t)
    {
        return ts.save(t);
    }

    @GetMapping
    @RequestMapping("/gettask")
    public List<Task> getAllTask()
    {
        return ts.getAllTasks();

    }

}
