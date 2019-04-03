package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.School;
import com.example.demo.model.Student;
import com.example.demo.repository.SchoolRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class SchoolService {
	@Autowired
	private SchoolRepository schoolRepository;
	@Autowired
	private StudentRepository studentRepository;
	
	@Transactional
	public void findStudentInfo() {
		School school = new School("�ŷ°�");
		
		schoolRepository.save(school);
		
		Student stu1 = new Student("����");
		Student stu2 = new Student("����");
		Student stu3 = new Student("����");
		
		stu1.setSchool(school);
		stu2.setSchool(school);
		stu3.setSchool(school);
		
		studentRepository.save(stu1);
		studentRepository.save(stu2);
		studentRepository.save(stu3);
		
		List<Student> students = studentRepository.findAll();
		
		for (Student s : students) {
			System.out.println(s.getUserName() + "," + s.getSchool().getName());
		}
	}
}
