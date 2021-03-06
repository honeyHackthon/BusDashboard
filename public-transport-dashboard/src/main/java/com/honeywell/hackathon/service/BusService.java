package com.honeywell.hackathon.service;

import java.util.Optional;

import com.honeywell.hackathon.entity.Capacity;
import com.honeywell.hackathon.entity.Location;
import com.honeywell.hackathon.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;

import com.honeywell.hackathon.entity.Bus;
import com.honeywell.hackathon.repository.BusRepository;

public class BusService {

	@Autowired
	BusRepository buRepository;

	@Autowired
	LocationRepository locationRepository;
	
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

	public ResponseEntity<Object> getLocation(String busId) {
		Location location = locationRepository.getLocationByBus(busId);
		if(location!=null){
			return new ResponseEntity<Object>(location,HttpStatus.OK);
		}else{
			return new ResponseEntity<Object>(busId +" location is not available.", HttpStatus.NOT_FOUND);
		}
	}

	public Integer getOccupancyStatus(final  String busId) {
		return buRepository.getSeatsLeft(busId);
	}

	public Integer getTimeSpentOnRoute(final String busId) {
		return null;
	}

	public ResponseEntity<Object> getCapacity(String busId) {
		Capacity capacity = locationRepository.getCapacity(busId);
		if(capacity!=null){
			return new ResponseEntity<Object>(capacity,HttpStatus.OK);
		}else{
			return new ResponseEntity<Object>(busId +" location is not available.", HttpStatus.NOT_FOUND);
		}
	}
}
