package com.mongoExample.Mongo.controller;

import com.mongoExample.Mongo.model.Task;
import com.mongoExample.Mongo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService ts;

    @PostMapping
    public String save(@RequestBody Task t)
    {
        return ts.save(t);
    }

}
