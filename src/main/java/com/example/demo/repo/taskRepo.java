package com.example.demo.repo;

import com.example.demo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface taskRepo extends  MongoRepository<Task,String> {
}
