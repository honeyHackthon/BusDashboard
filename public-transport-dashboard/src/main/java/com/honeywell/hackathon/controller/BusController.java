package com.honeywell.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.hackathon.service.BusService;

@RestController(value="/busInfo")
public class BusController {
	
	@Autowired
	BusService busService;
	
	
	@GetMapping(value="/getFuelConsumption")
	public ResponseEntity<Object> getFuelConsumption(String busId) {
		return busService.getFuelConsumption(busId);
	}
	
	

}
