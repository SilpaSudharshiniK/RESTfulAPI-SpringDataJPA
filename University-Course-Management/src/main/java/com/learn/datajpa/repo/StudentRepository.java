package com.learn.datajpa.repo;

import org.springframework.data.domain.Pageable;

import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.learn.datajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	Page<Student> findAll(Pageable pageable);
	
	List<Student> findByDepartmentName(String depName);

    @Query("SELECT s FROM Student s WHERE s.name LIKE %:name%")
    List<Student> searchByName(@Param("name") String name);
	
	
	@Query(value = "SELECT * FROM student s JOIN address a ON s.address_id = a.id WHERE a.city = :city",
			nativeQuery = true)
	List<Student> findByCity(String city);

	
	

	
	
	

}
