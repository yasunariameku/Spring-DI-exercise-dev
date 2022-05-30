package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Major;
import com.example.entity.Student;
import com.example.service.MajorService;
import com.example.service.StudentService;

@SpringBootApplication
public class SpringDiExercisesDevApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringDiExercisesDevApplication.class, args);
		
			StudentService studentService = context.getBean(StudentService.class);
			List<Student> studentList = studentService.findAll();
			
			MajorService majorService = context.getBean(MajorService.class);
			List<Major> MajorList = majorService.findAll();
			
			System.out.println("【student】");
			for(Student s:studentList) {
				System.out.println(s.getStudentInfo());
			}
			
			System.out.println("【major】");
			for (Major m:MajorList) {
				System.out.println(m.getMajorInfo());
			}
	}

}
