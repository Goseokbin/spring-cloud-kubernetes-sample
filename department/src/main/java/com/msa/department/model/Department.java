package com.msa.department.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "department")
@Getter
@DynamicUpdate
public class Department {

	@Column(name = "id")
	@Id
	private String id;
	@Column(name = "organizationId")
	@Setter
	private String organizationId;
	@Column(name = "name")
	@Setter
	private String name;
//	@Transient
//	private List<Employee> employees = new ArrayList<>();

	public Department() {

	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", organizationId=" + organizationId + ", name=" + name + "]";
	}

}
