package com.example.restfulAPI;

import com.example.restfulAPI.Service.EmployeeManager;
import com.example.restfulAPI.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RestfulApiApplicationTests {

	private EmployeeManager employeeManager;

	// Helper method
	int getEmployeeCount(EmployeeManager manager) {
		return manager.getAllEmployees().getEmployeeList().size();
	}

	@BeforeEach
	void setUp() {
		this.employeeManager = new EmployeeManager();
		Employee newEmployee = new Employee(1001, "Daria", "Jones", "dariajones@gmail.com", "Software developer");
		this.employeeManager.addEmployee(newEmployee);
	}

	@Test
	void createEmployeeManager() {
		EmployeeManager newEmployeeManager = new EmployeeManager();
		assertTrue(getEmployeeCount(newEmployeeManager) > 0, "Employee list should not be empty on init");
	}

	@Test
	void addEmployee() {
		EmployeeManager manager = new EmployeeManager();
		int employeeCount = getEmployeeCount(manager);
		Employee employee = new Employee(1002, "Alex", "Smith", "alexsmith@gmail.com", "QA Engineer");
		manager.addEmployee(employee);
		assertEquals(employeeCount + 1, getEmployeeCount(manager), "Employee count should increase by 1");
	}

	@Test
	void employeeIdInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		assertTrue(employees.stream().anyMatch(e -> e.getEmployee_id() == 1001),
				"Employee ID 1001 should be found in the list");
	}

	@Test
	void employeeFirstNameInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		assertTrue(employees.stream().anyMatch(e -> e.getFirst_name().equals("Daria")),
				"First name 'Daria' should be found in the list");
	}

	@Test
	void employeeLastNameInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		assertTrue(employees.stream().anyMatch(e -> e.getLast_name().equals("Jones")),
				"Last name 'Jones' should be found in the list");
	}

	@Test
	void employeeEmailInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		assertTrue(employees.stream().anyMatch(e -> e.getEmail().equals("dariajones@gmail.com")),
				"Email 'dariajones@gmail.com' should be found in the list");
	}

	@Test
	void employeeTitleInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		assertTrue(employees.stream().anyMatch(e -> e.getTitle().equals("Software developer")),
				"Title 'Software developer' should be found in the list");
	}
}
