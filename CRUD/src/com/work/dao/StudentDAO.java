package com.work.dao;

import java.util.List;

import com.work.entity.Student;

public interface StudentDAO {

	public void saveStudentObj(Student student);

	public List<Student> getAllStudent();

	public Student getStudentByName(String name);

	public void deleteStudent(Student s);

}
