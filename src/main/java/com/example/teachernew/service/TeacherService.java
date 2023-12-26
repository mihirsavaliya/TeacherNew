package com.example.teachernew.service;

import java.util.List;

import com.example.teachernew.model.Teacher;

public interface TeacherService 
{
	List<Teacher> getAllTeacher();
	
	public Teacher addTeacher(Teacher teacher);
	
	public Teacher findById(long tid);
}
