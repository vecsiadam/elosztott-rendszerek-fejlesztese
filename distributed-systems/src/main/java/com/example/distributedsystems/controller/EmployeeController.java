package com.example.distributedsystems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.distributedsystems.model.dto.EmployeeDTO;
import com.example.distributedsystems.service.EmployeeService;

/**
 * Employee calls.
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
	public ResponseEntity<List<EmployeeDTO>> getEmployees() {
		return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
	}

	@PostMapping("/save-employee")
	public ResponseEntity<Void> saveEmployee(@RequestBody EmployeeDTO employee) {
		employeeService.saveEmployee(employee);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/update-employee")
	public ResponseEntity<Void> updateEmployee(@RequestBody EmployeeDTO employee) {
		employeeService.updateEmployee(employee);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/delete-employee/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
