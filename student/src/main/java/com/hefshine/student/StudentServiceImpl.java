package com.hefshine.student;

import java.util.Collection;
import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	StudentRepository stdrepository;
	
	@Override
	public Student saveEmployee(Student std) {
		
		return  stdrepository.save(std);
	}

	@Override
	public Student UpdateEmployee(Student std) {
		Student s = stdrepository.save(std);
		return s;
	}

	@Override
	public Optional<Student> findById(int id) {
		
		Optional<Student> std = stdrepository.findById(id);
		return std;
	}

	@Override
	public void DeleteById(int id) {
		stdrepository.deleteById(id);;
		
		}

	@Override
	public java.util.List<Student> findAll() {
		java.util.List<Student> ListOfstd = (java.util.List<Student>) stdrepository.findAll();
		return ListOfstd;
	}

	
	

}
