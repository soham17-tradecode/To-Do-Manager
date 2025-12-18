package com.example.demo.model;

//import jakarta.persistence.*;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "todoinfo1")
@Data

public class Task {


    @Id
    private String id;
    private String title;

    private String description;

    private Priority priority;


    private category category;

    private boolean completed;





}
