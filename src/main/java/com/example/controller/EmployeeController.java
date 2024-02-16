package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeService.EmployeeService;
import com.example.entity.Employee;

@RestController
public class EmployeeController {
@Autowired
EmployeeService employeeService;

@GetMapping("/employee")
private List<Employee> getAllEmployee()
{
	return employeeService.getAllEmployee();	
}

@GetMapping("/employee/{employee_id}")
private Employee getEmployee(@PathVariable ("employee_id")int employee_id) 
{
	return employeeService.getEmployeeById(employee_id);
	
}
@DeleteMapping("/employee/{employee_id}")
public ResponseEntity<String> deleteEmployee(@PathVariable("employee_id") int employee_id) {
    employeeService.delete(employee_id);
    return ResponseEntity.ok("Employee deleted successfully");
}
@PostMapping("/employee")
private ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
    employeeService.saveOrUpdate(employee);
    return ResponseEntity.ok("Employee saved successfully");
}

@PutMapping("/employee")
public ResponseEntity<String> update(@PathVariable("employee_id") int employee_id, @RequestBody Employee employee) {
    employeeService.saveOrUpdate(employee);
    return ResponseEntity.ok("Employee updated successfully");
}
}
