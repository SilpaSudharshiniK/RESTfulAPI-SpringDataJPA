package com.learn.datajpa.controller;

import org.springframework.data.domain.Page;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.datajpa.entities.*;
import com.learn.datajpa.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
    public Page<Student> getAll(@RequestParam(defaultValue = "0") int page,
                                @RequestParam(defaultValue = "5") int size) {
        return studentService.getAllStudents(PageRequest.of(page, size));
    }
	
	
    @GetMapping("/search")
    public List<Student> searchByName(@RequestParam String name) {
        return studentService.searchByName(name);
    }

	
	@GetMapping("/city")
	public List<Student> findByCity(@RequestParam String city){
		return studentService.findByCity(city);
	}
	
	@GetMapping("/by-dep/{name}")
	public List<Student> findByDepartmentName(@PathVariable String depName){
		return studentService.findByDepartmentName(depName);
		
	}
}
