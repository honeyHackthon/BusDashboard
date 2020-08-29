package com.honeywell.hackathon.controller;

import com.honeywell.hackathon.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.hackathon.service.BusService;

@RestController(value = "/busInfo")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping(value = "/fuelconsumption/{bus-id}")
    public ResponseEntity<Object> getFuelConsumption(@PathVariable("bus-id") final String busId) {
        return busService.getFuelConsumption(busId);
    }

    @GetMapping(value = "/occupancy/{bus-id}")
    public ResponseEntity<Integer> getOccupancy(@PathVariable("bus-id") final String busId) {
       final Integer noOfSeats= busService.getOccupancyStatus(busId);
       return new ResponseEntity<Integer>(noOfSeats, HttpStatus.OK);
    }

    @GetMapping(value = "/routetimespent/{bus-id}")
    public ResponseEntity<Integer> getTimeSpentOnRoute(@PathVariable("bus-id") final String busId) {
        final Integer noOfHours= busService.getTimeSpentOnRoute(busId);
        return new ResponseEntity<Integer>(noOfHours, HttpStatus.OK);
    }

    @GetMapping(value = "/location/{bus-id}")
    public ResponseEntity<Object> getLocation(@PathVariable("bus-id") final String busId) {
        return busService.getLocation(busId);
    }
}
