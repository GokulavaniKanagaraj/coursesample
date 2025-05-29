package com.course.democourse.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String Name;
private int Price;
public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Course( String name, int price) {
	super();
	
	this.Name = name;
	Price = price;
}
public Course() {
    // Default constructor required by Hibernate
}

}
