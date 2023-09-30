package com.msa.department.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DepartmentController {
        @GetMapping("/test")
        public String TestGetMapping(){
            return "department test";
        }
}
