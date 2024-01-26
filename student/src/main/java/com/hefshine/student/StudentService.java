package com.hefshine.student;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


public interface StudentService {
	
    Student saveEmployee(Student emp);
	
	Student UpdateEmployee(Student emp);
	
	List<Student> findAll();

	Optional<Student> findById(int id);

    void DeleteById(int id);

}
