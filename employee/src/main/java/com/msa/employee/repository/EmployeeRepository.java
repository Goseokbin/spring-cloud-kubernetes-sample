package com.msa.employee.repository;

import com.msa.employee.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    List<Employee> findByDepartmentId(Integer departmentId);
}
