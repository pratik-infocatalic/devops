package com.tcs.employeeManagerApp.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employeeManagerApp.exceptions.UserNotFoundException;
import com.tcs.employeeManagerApp.model.Employee;
import com.tcs.employeeManagerApp.repo.EmployeeRepo;
@Service
public class EmployeeService {
private final EmployeeRepo employeeRepo;

@Autowired
public EmployeeService(EmployeeRepo employeeRepo) {
	this.employeeRepo=employeeRepo;
}

public Employee addEmployee(Employee employee) {
	employee.setEmployeeCode(UUID.randomUUID().toString());
	//here i didn't use "" to string instead of that i used tostring directly
	
	return employeeRepo.save(employee);
}

 public java.util.List<Employee> findAllEmployees(){
	 
	 
	 return employeeRepo.findAll();
 }
 
 public Employee updateEmployee(Employee employee) {
	 
	 return employeeRepo.save(employee);
 }
 
 public Employee findEmplyeeById(Long id) {
	 return employeeRepo.findEmplyeeById(id).orElseThrow(()->new UserNotFoundException("user by id"+id+" was not found"));
 }
 
 public void deleteEmployee(Long id) {
	 employeeRepo.deleteEmployeeById(id);
 }
 
  

}
