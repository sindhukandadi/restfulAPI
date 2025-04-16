package com.example.restfulAPI.Service;

import com.example.restfulAPI.model.Employee;
import com.example.restfulAPI.model.Employees;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private final Employees employees;

    public EmployeeManager() {
        List<Employee> initialEmployees = new ArrayList<>(List.of(
                new Employee(1, "John", "Doe", "john.doe@example.com", "Developer"),
                new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Manager"),
                new Employee(3, "Bob", "Brown", "bob.brown@example.com", "Analyst")
        ));
        this.employees = new Employees(initialEmployees);
    }

    public Employees getAllEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}