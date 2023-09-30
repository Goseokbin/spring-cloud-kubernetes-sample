package com.msa.department.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "employee")
@Getter
@Setter
@DynamicUpdate
public class Employee {
	@Id
	@Column(name="id")
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="position")
	private String position;

	public Employee() {

	}
	
	public Employee(String name, int age, String position) {
		this.name = name;
		this.age = age;
		this.position = position;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + "]";
	}

}
