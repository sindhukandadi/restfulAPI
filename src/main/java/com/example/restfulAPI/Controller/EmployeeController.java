package com.example.restfulAPI.Controller;

import com.example.restfulAPI.Service.EmployeeManager;
import com.example.restfulAPI.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping("/employees")
    public Employees getEmployees() {
        return employeeManager.getAllEmployees();
    }
}
