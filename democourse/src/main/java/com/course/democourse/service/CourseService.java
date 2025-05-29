package com.course.democourse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.course.democourse.entity.Course;
import com.course.democourse.repository.CourseRepo;

import jakarta.transaction.Transactional;

@Service
public class CourseService {
     @Autowired
     private CourseRepo courseRepo;
    
	
	public void save(Course course) {
		courseRepo.save(course);
	}
	
	public List<Course> findall(){
		List<Course> course2=courseRepo.findAll();
		return course2;
	}
	@Transactional
	public void UpdateById(String Name, Long id){
        Course course1 = courseRepo.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
			course1.setName(Name);
		
	  courseRepo.save(course1);
		
	}

	public Optional<Course> findById(Long id) {
		// TODO Auto-generated method stub
		   Optional<Course> courses=courseRepo.findById(id);

		return courses;
	}
}
