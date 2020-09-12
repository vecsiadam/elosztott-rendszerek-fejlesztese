package com.example.distributedsystems.model.dto;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Mit csinál?
 *
 * @author Adam Vecsi
 * @date 2020-09-12
 */
@Data
@NoArgsConstructor
public class EmployeeDTO {

	private Long id;

	private String firstName;

	private String lastName;

	private LocalDate dateOfBirth;

	private String position;

	private LocalDate firstDayInCompany;
}
