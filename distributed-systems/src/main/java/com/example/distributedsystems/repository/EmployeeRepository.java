package com.example.distributedsystems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.distributedsystems.model.entity.Employee;

/**
 * Jpa repositroy class to save, update, get, delete, etc. employees.
 *
 * @author Adam Vecsi
 * @date 2020-09-12
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
