package com.mongoExample.Mongo.repository;

import com.mongoExample.Mongo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepo extends MongoRepository<Task, String> {



}
