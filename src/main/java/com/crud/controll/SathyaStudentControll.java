package com.crud.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.SathyaStudents;
import com.crud.service.StudentService;


@RestController
public class SathyaStudentControll {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String test() {
		return " not working!!";
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody SathyaStudents students){
		SathyaStudents studentss=service.saveStudent(students);
		return new ResponseEntity<SathyaStudents>(studentss,HttpStatus.OK);
	}
	
	@GetMapping("/get/{studentId}")
	public ResponseEntity<?> getOne(@PathVariable Integer studentId){
		System.out.println("Studentid is"+studentId);
		SathyaStudents student=service.getOneStudent(studentId);
		return new ResponseEntity<SathyaStudents>(student,HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAll(){
		List<SathyaStudents> student=service.getAllStudent();
		return new ResponseEntity<List<SathyaStudents>>(student,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<String> delete(@PathVariable Integer studentId){
		service.deleteStudent(studentId);
		return new ResponseEntity<String>("Delete Successfully",HttpStatus.OK);
	}
	
	@PutMapping("/update/{studentId}")
	public ResponseEntity<String> update(@RequestBody SathyaStudents sathya,@PathVariable Integer studentId){
		service.updateStudent(sathya, studentId);
		
		return new ResponseEntity<String>("Updated Successfully",HttpStatus.OK);
	}
	
//	@GetMapping("/getByName")
//	public ResponseEntity<List<SathyaStudents>> getByName(@PathVariable String student_name){
//		List<SathyaStudents> ss=service.findByStdname(student_name);
//		return new ResponseEntity<List<SathyaStudents>>(ss,HttpStatus.OK);
//		
//	}
//	@GetMapping("/getByName")
//	public ResponseEntity<List<SathyaStudents>> getByName(@PathVariable String studentname){
//		List<SathyaStudents> ss=service.findByStudentName(studentname);
//		return new ResponseEntity<List<SathyaStudents>>(ss,HttpStatus.OK);
//		
//	}

}
