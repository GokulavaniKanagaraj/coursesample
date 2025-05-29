package com.course.democourse.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.course.democourse.entity.Course;
import com.course.democourse.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping
	public List<Course> getAll(){
		
		return courseService.findall();
	}
   @PostMapping
   public void save(@RequestBody Course course){
	    courseService.save(course);
	   
   }
   @GetMapping("/{id}")
   public Optional<Course>getById(@PathVariable("id") Long id) {
     return courseService.findById(id);
   }
   
   @PutMapping("/{id}")
   public void updateById(@PathVariable("id") Long id,@RequestParam String Name){
	    courseService.UpdateById(Name, id);
   }
}
