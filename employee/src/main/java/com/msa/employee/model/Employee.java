package com.msa.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int departmentId;
    private String name;
    private int age;
    private String position;

    public Employee(int departmentId, String name, int age, String position){
        this.departmentId = departmentId;
        this.name = name;
        this.age = age;
        this.position = position;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id +", departmentId=" + departmentId
                + ", name=" + name + ", position=" + position + "]";
    }
}
