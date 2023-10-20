package com.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int roll;
	private long salary;
	private int age;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", roll=" + roll + ", salary=" + salary + ", age=" + age + "]";
	}
	public Employee(int id, String name, int roll, long salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.salary = salary;
		this.age = age;
	}
	public Employee() {
		super();
	}
	
	

}
