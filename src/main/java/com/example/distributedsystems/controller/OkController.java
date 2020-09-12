package com.example.distributedsystems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: Mit csinál?
 *
 * @author Adam Vecsi
 * @date 2020-09-12
 */
@RestController
public class OkController {

	@GetMapping("/ok")
	public String getOk() {
		return "OK";
	}
}
