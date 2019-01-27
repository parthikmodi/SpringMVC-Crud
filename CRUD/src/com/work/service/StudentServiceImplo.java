package com.work.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dao.StudentDAO;
import com.work.entity.Student;

@Service
public class StudentServiceImplo implements StudentService{

	@Autowired
	private StudentDAO studentDAO;
	
	@Transactional
	public void saveStudentObj(Student student) {
		studentDAO.saveStudentObj(student);
	}

	@Transactional
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDAO.getAllStudent();
	}
	
	@Transactional
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentDAO.getStudentByName(name);
	}
	
	@Transactional
	public void deleteStudentByName(Student s) {
		// TODO Auto-generated method stub
		studentDAO.deleteStudent(s);
	}

}
