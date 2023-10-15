package com.msa.department.controller;

import com.msa.department.model.Department;
import com.msa.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @GetMapping("/test")
    public String TestGetMapping(){
        return "department test";
    }

    @PostMapping("/")
    public Department createDepartment(@RequestBody Department department){
        LOGGER.info("Create Department..: {}",department);
        return departmentRepository.save(department);
    }
    @GetMapping("/")
    public Iterable<Department> getDepartmentList(){
        LOGGER.info(" Get Department List");
        return departmentRepository.findAll();
    }
    @GetMapping("/{id}")
    public Department getDepartmentDetail(@PathVariable("id") String id){
        return departmentRepository.findById(id).orElseThrow();
    }

}
