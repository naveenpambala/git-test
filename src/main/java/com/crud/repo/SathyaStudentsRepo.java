package com.crud.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.SathyaStudents;
 

@Repository
public interface SathyaStudentsRepo extends JpaRepository<SathyaStudents, Integer> {
	
//	public List<Address> findByCity(String city);
	
//	 public List<SathyaStudents> findBystudentname(String studentname);

}
