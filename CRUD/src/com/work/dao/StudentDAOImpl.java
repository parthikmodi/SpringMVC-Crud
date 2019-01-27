package com.work.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.work.entity.Student;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveStudentObj(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student); 
	}

	public List<Student> getAllStudent() {
		return sessionFactory.getCurrentSession().createQuery("from Student").list(); 
	}

	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return (Student)sessionFactory.getCurrentSession().get(Student.class,name);
	}

	public void deleteStudent(Student s) {
		sessionFactory.getCurrentSession().delete(s);
	}

}
