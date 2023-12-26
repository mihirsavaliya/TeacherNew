package com.example.teachernew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teachernew.exception.TeacherNotFoundException;
import com.example.teachernew.model.Teacher;
import com.example.teachernew.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService
{
	@Autowired
	TeacherRepository teacherrepository;

	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return teacherrepository.findAll();
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherrepository.save(teacher);
	}

	@Override
	public Teacher findById(long tid) {
		// TODO Auto-generated method stub
		Teacher dct = teacherrepository.findById(tid).orElseThrow(()->new TeacherNotFoundException("Teacher Not Found"));
		return dct;
	}
}
