package com.learn.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.learn.datajpa.entities.Student;
import com.learn.datajpa.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

    public Page<Student> getAllStudents(Pageable pageable) {
        return studentRepo.findAll(pageable);
    }

    public List<Student> searchByName(String name) {
        return studentRepo.searchByName(name);
    }

	public List<Student> findByCity(String city) {
		
		return studentRepo.findByCity(city);
	}

	public List<Student> findByDepartmentName(String depName) {		
		return studentRepo.findByDepartmentName(depName);
	}

}
