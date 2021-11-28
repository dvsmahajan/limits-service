package com.dvslearn.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvslearn.microservices.limitsservice.dto.LimitsServiceDTO;

@RestController
public class LimitsController {

	@Autowired
	private LimitsServiceDTO limitsService;
	
	@GetMapping("/checkLimits")
	private LimitsServiceDTO getLimits() {
		return limitsService;
	}
}
