package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BastionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BastionController {
    @Autowired
	private BastionService bastionService;
	
    @GetMapping("/gelAllData")
	public ResponseEntity<?> getAllBookingDetails() {
		log.info("getting list of all bookingDetails");
		return new ResponseEntity<>(bastionService.getAll(), HttpStatus.OK);
	}
}
