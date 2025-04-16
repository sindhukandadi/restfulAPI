package com.example.restfulAPI.model;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private final List<Employee> employeeList;

    public Employees(List<Employee> employeeList) {
        this.employeeList = new ArrayList<>(employeeList); // Mutable copy
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}