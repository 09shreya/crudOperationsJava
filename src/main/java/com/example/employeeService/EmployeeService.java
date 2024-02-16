package com.example.employeeService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee()
	{
		List<Employee> employee=new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee1->employee.add(employee1));
		return employee ;
	}

	public Employee getEmployeeById(int employee_id)
	{
		return employeeRepository.findById(employee_id).get() ;
	}

	public void delete(int employee_id) 
	{
	employeeRepository.deleteById(employee_id);	
		
	}

	public void saveOrUpdate(Employee employee) 
	{
		employeeRepository.save(employee);
		
		
	}
	public void update(Employee employee,int employee_id)
	{
		employeeRepository.save(employee);
		
	}
	

}
