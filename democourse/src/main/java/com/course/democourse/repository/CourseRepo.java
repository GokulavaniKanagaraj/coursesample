package com.course.democourse.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.democourse.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long>  {


	void save(Optional<Course> course1);

}
