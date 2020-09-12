package com.example.distributedsystems.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.distributedsystems.model.dto.EmployeeDTO;
import com.example.distributedsystems.model.entity.Employee;
import com.example.distributedsystems.repository.EmployeeRepository;
import com.example.distributedsystems.util.EmployeeMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * This service manages to save, update, delete and get employees.s
 *
 * @author Adam Vecsi
 * @date 2020-09-12
 */

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeDTO> getEmployees() {
		List<EmployeeDTO> employeeList = employeeRepository.findAll().stream().map(EmployeeMapper::mapToDTO)
				.collect(Collectors.toList());
		log.info("Employee list: {}", employeeList);
		return employeeList;
	}

	@Override
	public void saveEmployee(EmployeeDTO employeeDTO) {
		Employee employee = employeeRepository.save(EmployeeMapper.mapToEntity(employeeDTO));
		log.info("Succesfully save employee with id: {}", employee.getId());

	}

	@Override
	public void updateEmployee(EmployeeDTO employeeDTO) {
		Employee employee = employeeRepository.save(EmployeeMapper.mapToEntity(employeeDTO));
		log.info("Succesfully update employee with id: {}", employee.getId());
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		log.info("Succesfully delete employee with id: {}", id);
	}

}
