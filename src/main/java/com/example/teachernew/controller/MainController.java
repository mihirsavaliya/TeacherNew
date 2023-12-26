package com.example.teachernew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.teachernew.model.Teacher;
import com.example.teachernew.service.TeacherService;

@Controller
public class MainController 
{
	@Autowired
	TeacherService teacherservice;
	
	@GetMapping("/getAllTeacher")
	@ResponseBody
	public List<Teacher> getAllTeacher()
	{
		return teacherservice.getAllTeacher();
	}
	
	@PostMapping("/addTeacher")
	@ResponseBody
	public Teacher addTeacher(@RequestBody Teacher teacher)
	{
		return teacherservice.addTeacher(teacher);
	}
	
	@GetMapping("/findTeacherById")
	@ResponseBody
	public Teacher findById(@RequestParam("tid") int tid)
	{
		return teacherservice.findById(tid);
	}
}
