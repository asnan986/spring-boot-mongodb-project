package org.dxc.mongodb.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;



import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/saveemployees")
	public void addEmployee(@RequestBody List<Employee> employeelist) {

		employeeService.saveEmployee(employeelist);
	}

	@GetMapping("/getallemployee")
	public Collection<Employee> retrieveemployee() {

		return employeeService.getAllEmployees();
	}

	@GetMapping("/getemployee/{id}")
	public Optional<Employee> getEmployeeid(@PathVariable int id) {

		return employeeService.findEmployeeById(id);
	}

	@PutMapping("/updateemployee/{id}")
   public void updateEmployeeid(@PathVariable int id, @RequestBody Employee employee) {
	   
	   employee.setEmployeeId(id);
	   employeeService.updateEmployee(employee);
   }

	@DeleteMapping("/deleteemployee/{id}")
   public void deleteEmployeeid(@PathVariable("id")int id){
	   
	  employeeService.deleteEmployeeId(id);
   }
}
