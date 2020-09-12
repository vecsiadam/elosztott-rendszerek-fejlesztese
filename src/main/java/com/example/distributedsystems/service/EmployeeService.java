package com.example.distributedsystems.service;

import java.util.List;

import com.example.distributedsystems.model.dto.EmployeeDTO;

/**
 * TODO: Mit csinál?
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
