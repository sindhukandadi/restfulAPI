package com.example.restfulAPI.Controller;

import com.example.restfulAPI.Service.EmployeeManager;
import com.example.restfulAPI.model.Employee;
import com.example.restfulAPI.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping
    public Employees getAllEmployees() {
        return employeeManager.getAllEmployees();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeManager.getAllEmployees().getEmployeeList().add(employee);
        return employee;
    }
}
