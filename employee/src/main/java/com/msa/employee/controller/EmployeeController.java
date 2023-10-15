package com.msa.employee.controller;

import com.msa.employee.model.Employee;
import com.msa.employee.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/test")
    public String TestGetMapping(){
        return "employee test";
    }

    @PostMapping("/")
    public Employee createEmployee(@RequestBody Employee employee) {
        LOGGER.info("Employee add...: {} ", employee);
        return employeeRepository.save(employee);
    }

    @GetMapping("/")
    public Iterable<Employee> getEmployeeList(){
        return employeeRepository.findAll();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeDetail(@PathVariable("id") String id){
        return employeeRepository.findById(id).orElseThrow();
    }
    @GetMapping("/department/{id}")
    public Iterable<Employee> getEmployeByDepartment(@PathVariable("id") Integer id){
        return employeeRepository.findByDepartmentId(id);
    }
}
