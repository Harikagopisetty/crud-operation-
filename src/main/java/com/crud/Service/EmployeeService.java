package com.crud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Employee;
import com.crud.repository.EmployeeRepo;
@Service
public class EmployeeService {
@Autowired	
 private EmployeeRepo employeeRepo;
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	public Employee updateEmployee(Employee empl) {
		Optional<Employee> optional = employeeRepo.findById(empl.getId());

		
		if (optional.get()==null) {
			
			throw new ArithmeticException("id is not present");
		}
    
	
		return employeeRepo.save(empl);
	}
	public void deleteEmployee(int id) {
		Optional<Employee> optional = employeeRepo.findById(id);	
		if (optional.get()==null) {
			
			throw new ArithmeticException("id is not present");
		}
	employeeRepo.deleteById(id);
	}
	public List<Employee> getAllStudents() {
	  return employeeRepo.findAll();
	}

}
