package com.crud.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.SathyaStudents;
import com.crud.repo.SathyaStudentsRepo;
import com.crud.service.StudentService;

@Service
public class SathyaStudentImp implements StudentService{
	
	@Autowired
	private SathyaStudentsRepo repo;
	
	

	@Override
	public SathyaStudents saveStudent(SathyaStudents sathyaStudents) {
		SathyaStudents saveStudent=repo.save(sathyaStudents);
		
		return saveStudent;
	}

	@Override
	public SathyaStudents getOneStudent(Integer studentId) {
		SathyaStudents getOneStuden=repo.findById(studentId).get();
		
		return getOneStuden;
	}

	@Override
	public List<SathyaStudents> getAllStudent() {
		List<SathyaStudents> allStudents	=repo.findAll();
		
		return allStudents;
	}

	@Override
	public String deleteStudent(Integer studentId) {
		repo.deleteById(studentId);
		return "Student deleted Successfull";
		
	}

	@Override
	public SathyaStudents updateStudent(SathyaStudents sathyaStudents, Integer studentId) {
		Optional<SathyaStudents> std	=repo.findById(studentId);
	SathyaStudents student=new SathyaStudents();
	if(std.isPresent()) {
		
		            student=std.get();
		            student.setStudentid(studentId);
		student.setStudentname(sathyaStudents.getStudentname());
		student.setStudentemail(sathyaStudents.getStudentemail());
		student.setStudentpassword(sathyaStudents.getStudentpassword());
                  
		
	}

	return  repo.save(student);
	}
 

//	@Override
//	public List<SathyaStudents> findByStdname(String student_name) {
//		List<SathyaStudents> listStud=repo.findByStdname(student_name);
//		return listStud;
//	}

	 

	 

//@Override
//public List<SathyaStudents> findByStudentName(String studentname) {
//	List<SathyaStudents> sathyaStudent= repo.findByStudentName(studentname);
//	return sathyaStudent;
//}

}
