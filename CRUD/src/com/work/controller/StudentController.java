package com.work.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.work.entity.*;
import com.work.service.StudentService;

import com.work.service.*;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/Add")
	public String displayForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "Add";
		
	}
	
	@RequestMapping(value="/saveProcess")
	public String saveProcess(@ModelAttribute("student") Student student,Model model ) {
		
		studentService.saveStudentObj(student);
		List <Student> studentList = studentService.getAllStudents();
		model.addAttribute("studentList", studentList);
		return "ListStudents";
	}
	
	@RequestMapping(value="/ListStudents")
	public String getAllStudents(Model model ) {
		 
		List <Student> studentList = studentService.getAllStudents();
		model.addAttribute("studentList", studentList);
		return "ListStudents";
	}
	
	@RequestMapping(value="/updateRecord")
	public String showUpdateForm(@RequestParam ("name") String name, Model model)
	{
		Student student =getStudentByName(name);
		model.addAttribute("student", student);
		return "Add";
		
	}
	
	public Student getStudentByName(String name)
	{
		Student student= studentService.getStudentByName(name);
		return student;
	}
	
	@RequestMapping(value="/deleteRecord")
	public String deleteStudentByName(String name)
	{
		Student student = getStudentByName(name);
		studentService.deleteStudentByName(student);
		return "redirect:/ListStudents";
	}
}
