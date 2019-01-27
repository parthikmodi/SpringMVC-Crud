package com.work.service;


import java.util.List;

import com.work.entity.Student;

public interface StudentService {

	public void saveStudentObj(Student student);

	public List<Student> getAllStudents();

	public Student getStudentByName(String name);
	
	public void deleteStudentByName(Student s);

}
