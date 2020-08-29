package com.honeywell.hackathon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;

import com.honeywell.hackathon.entity.Bus;
import com.honeywell.hackathon.repository.BusRepository;

public class BusService {

	@Autowired
	BusRepository buRepository;
	
	public ResponseEntity<Object> getFuelConsumption(String busId) {
		String fuelEff=null;
		Bus bus=buRepository.getFuelConsumption(busId);
		
		if(bus!=null && !StringUtils.isEmpty(bus)) {
			fuelEff=bus.getFuelCapacity();
			return new ResponseEntity<Object>(fuelEff, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Object>(busId +" is not available.", HttpStatus.NOT_FOUND);
		}
	}

}
