package com.msa.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/test")
    public String TestGetMapping(){
        return "employee test";
    }
}
