package com.msa.department.repository;

import com.msa.department.model.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department,String > {
}
