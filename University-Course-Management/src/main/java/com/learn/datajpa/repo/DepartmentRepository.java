package com.learn.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.datajpa.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
