package com.example.demo;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Dao.TaskRepository;
import com.example.demo.Entities.Task;

@SpringBootApplication
public class SecurityProjetApplication implements CommandLineRunner {

	@Autowired
	private TaskRepository taskRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityProjetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Stream.of("T1","T2","T3").forEach(t->{
//			taskRepository.save(new Task(null,t));
//		});
//		
//		taskRepository.findAll().forEach(t->{
//			System.out.println(t.getTaskName());
//		});
		
	}

}
