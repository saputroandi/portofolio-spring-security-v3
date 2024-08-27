package com.portofolio.springkeycloak.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "keycloak")
public class HelloController {

	@GetMapping("/greeting-owner")
	@PreAuthorize("hasRole('owner')")
	public ResponseEntity<String> greetingOrner() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("hello owner");
	}

	@GetMapping("/greeting")
	public ResponseEntity<String> greeting() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("hello world");
	}

}
