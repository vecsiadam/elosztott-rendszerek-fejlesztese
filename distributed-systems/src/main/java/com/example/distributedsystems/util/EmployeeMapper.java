package com.example.distributedsystems.util;

import com.example.distributedsystems.model.dto.EmployeeDTO;
import com.example.distributedsystems.model.entity.Employee;

import lombok.experimental.UtilityClass;

/**
 * Mapper class to map entity to dto, dto to entity.
 *
 * @author Adam Vecsi
 * @date 2020-09-12
 */

@UtilityClass
public final class EmployeeMapper {

	public static EmployeeDTO mapToDTO(Employee entity) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(entity.getId());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setDateOfBirth(entity.getDateOfBirth());
		dto.setPosition(entity.getPosition());
		dto.setFirstDayInCompany(entity.getFirstDayInCompany());
		return dto;
	}

	public static Employee mapToEntity(EmployeeDTO dto) {
		Employee entity = new Employee();
		entity.setId(dto.getId());
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setDateOfBirth(dto.getDateOfBirth());
		entity.setPosition(dto.getPosition());
		entity.setFirstDayInCompany(dto.getFirstDayInCompany());
		return entity;
	}

}
