package com.mongoExample.Mongo.services;

import com.mongoExample.Mongo.model.Task;

import java.util.List;

public interface TaskService {


    String save(Task t);

    List<Task> getAllTasks();
}
