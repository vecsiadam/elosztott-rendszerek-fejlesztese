package com.example.distributedsystems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.distributedsystems.model.dto.EmployeeDTO;
import com.example.distributedsystems.service.EmployeeService;

/**
 * TODO: Mit csinál?
 *
 * @author Adam Vecsi
 * @date 2020-09-12
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/get-employees")
	public List<EmployeeDTO> getEmployees() {
		return employeeService.getEmployees();
	}

	@PostMapping("/save-employee")
	public void saveEmployee(@RequestBody EmployeeDTO employee) {
		employeeService.saveEmployee(employee);
	}

	@PutMapping("/update-employee")
	public void updateEmployee(@RequestBody EmployeeDTO employee) {
		employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/delete-employee/{id}")
	public void deleteEmployee(@RequestParam Long id) {
		employeeService.deleteEmployee(id);
	}
}
