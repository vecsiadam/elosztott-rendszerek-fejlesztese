package com.example.distributedsystems.service;

import java.util.List;

import com.example.distributedsystems.model.dto.EmployeeDTO;

/**
 * This service manages to save, update, delete and get employees.s
 *
 * @author Adam Vecsi
 * @date 2020-09-12
 */
public interface EmployeeService {

	List<EmployeeDTO> getEmployees();

	void saveEmployee(EmployeeDTO employee);

	void updateEmployee(EmployeeDTO employee);

	void deleteEmployee(Long id);

}
