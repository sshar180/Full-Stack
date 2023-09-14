package com.mongoExample.Mongo.services;

import com.mongoExample.Mongo.model.Task;
import com.mongoExample.Mongo.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    TaskRepo tr;

    @Override
    public String save(Task t) {
        return tr.save(t).getTaskId();
    }

    @Override
    public List<Task> getAllTasks() {
        return tr.findAll();
    }
}
