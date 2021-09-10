package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Entities.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {

}
