package com.example.restfulAPI.Service;

import com.example.restfulAPI.model.Employee;
import com.example.restfulAPI.model.Employees;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "John", "Doe", "john.doe@example.com", "Developer"));
        list.add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Manager"));
        list.add(new Employee(3, "Bob", "Brown", "bob.brown@example.com", "Analyst"));
        this.employees = new Employees(list);
    }

    public Employees getAllEmployees() {
        return employees;
    }
}
