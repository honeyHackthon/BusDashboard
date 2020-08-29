package com.honeywell.hackathon.controller;

import com.honeywell.hackathon.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<String> getOccupancy(@PathVariable("bus-id") final String busId) {
        return null;
    }

    @GetMapping(value = "/routetimespent/{bus-id}")
    public ResponseEntity<String> getTimeSpentOnRoute(@PathVariable("bus-id") final String busId) {
        return null;
    }

    @GetMapping(value = "/location/{bus-id}")
    public ResponseEntity<Object> getLocation(@PathVariable("bus-id") final String busId) {
        return busService.getLocation(busId);
    }

    @GetMapping(value = "/location/{bus-id}")
    public ResponseEntity<Object> getCapacity(@PathVariable("bus-id") final String busId) {
        return busService.getCapacity(busId);
    }
}
