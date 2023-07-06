package com.tcs.employeeManagerApp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.employeeManagerApp.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	void deleteEmployeeById(Long id);
	Optional<Employee> findEmplyeeById(Long id);

}
