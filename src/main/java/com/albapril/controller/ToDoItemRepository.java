package com.albapril.controller;

import com.albapril.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoItemRepository extends JpaRepository<Task, Long> {

}
