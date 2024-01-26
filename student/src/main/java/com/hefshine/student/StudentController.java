package com.hefshine.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {
	
	@Autowired
	StudentService stdservice;
	

	//Create
	@PostMapping("student")
	public Student SaveEmployee(@RequestBody Student emp)
	{
		return stdservice.saveEmployee(emp);     
	}
	
	
	//Update
	@PutMapping("student")
	public Student UpdateEmployee(@RequestBody Student emp)
	{
		return stdservice.saveEmployee(emp);     
	}
	
	
	//Retrieve list
	@GetMapping("stds")
	public List<Student> finaAllEmployee(){
		List<Student> ListOfstd =  (List<Student>) stdservice.findAll();
		return ListOfstd;
		
	}
	
	//Retrieve one employee
	@GetMapping("std/{id}")
	public Optional<Student> findEmployeeId(@PathVariable("id") int id){
	Optional<Student> stdid = stdservice.findById(id);
		return stdid;
		
	}
	
	//Delete
	@DeleteMapping("student/{id}")
	public void deleteStudent(@PathVariable("id") Integer id) {
		stdservice.DeleteById(id);
	}

}
