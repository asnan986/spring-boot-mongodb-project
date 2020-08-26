package org.dxc.mongodb.service;

import java.util.Collection;

import java.util.List;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;

public interface EmployeeService {

	void saveEmployee(List<Employee> employeelist);

	Collection<Employee> getAllEmployees();

	Optional<Employee> findEmployeeById(int id);

	void updateEmployee(Employee employee);

	void deleteEmployeeId(int id);
	

}
