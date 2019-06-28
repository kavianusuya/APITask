package com.letsstartcodingspringbootrestapiexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.letsstartcodingspringbootrestapiexample.model.Employee;
import com.letsstartcodingspringbootrestapiexample.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	@Autowired
	EmployeeRepository employeeRepository;
	
	 public Employee save(Employee emp) {
		 return employeeRepository.save(emp);
		 
	 }
	 
	public List<Employee> findAll()
	{
		return employeeRepository.findAll();
		
	}
	
	public Employee findOne(Long empid) {
		return employeeRepository.findById(empid).orElse(null);
	}
	
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
}
