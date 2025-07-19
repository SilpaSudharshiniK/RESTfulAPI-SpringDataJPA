package com.learn.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.datajpa.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
