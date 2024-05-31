package com.crud.service;

import java.util.List;

import com.crud.entity.SathyaStudents;

public interface StudentService {
	
	public SathyaStudents saveStudent(SathyaStudents sathyaStudents);
	
	public SathyaStudents getOneStudent(Integer  studentId);
	
	public List<SathyaStudents> getAllStudent();
	
	public String deleteStudent(Integer studentId);
	
	public SathyaStudents updateStudent(SathyaStudents sathyaStudents,Integer studentId);
	
//	public List<SathyaStudents> findByStudentName( String studentname);
}