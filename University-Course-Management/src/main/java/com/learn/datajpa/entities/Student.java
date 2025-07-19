package com.learn.datajpa.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.learn.datajpa.config.Auditable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Student extends Auditable {
	
	@Id
	@GeneratedValue
    private Long id;
    private String name;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    
    @ManyToOne
    @JsonBackReference
    private Department department;
    
    @ManyToMany
    @JoinTable(name="student_course",
    joinColumns= @JoinColumn(name="student_id"),
    inverseJoinColumns= @JoinColumn(name="course_id")
    		)
    private List<Course> courses = new ArrayList<>();

	public Student() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
