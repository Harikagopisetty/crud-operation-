package com.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Service.EmployeeService;
import com.crud.entity.Employee;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService  employeeService;
	
@PostMapping("/addEmp")
public Employee addEMplEmployee(@RequestBody Employee employee) {
	return employeeService.addEmployee(employee);		
}

@PutMapping("/updateEmp")
public Employee updateEmployee(@RequestBody Employee employee) {
	return employeeService.updateEmployee( employee);
}
@DeleteMapping("/deleteEmp/{id}")
public String deleteEmployee(@PathVariable(value="id") int id) {
	 employeeService.deleteEmployee( id);
	 return "employee deleted successfully";
}
@GetMapping("/getEmp")
public List<Employee> get(){
	
	return employeeService.getAllStudents();
}

}


