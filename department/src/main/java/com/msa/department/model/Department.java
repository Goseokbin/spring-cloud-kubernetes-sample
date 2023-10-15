package com.msa.department.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "department")
@Getter
@Setter
@DynamicUpdate
public class Department {

	@Column(name = "id")
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	private String name;

//	@Transient
//	private List<Employee> employees = new ArrayList<>();

	public Department() {

	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
