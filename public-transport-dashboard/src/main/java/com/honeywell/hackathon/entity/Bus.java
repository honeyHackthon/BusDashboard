package com.honeywell.hackathon.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name="BUS")
@AllArgsConstructor
public class Bus implements Serializable {

	private static final long serialVersionUID = -8257300320536728626L;

	@Id
	@Column(name="BUS_ID",unique = true, nullable = false)
	private String busId;
	
	@Column(name="ROUTE_ID")
	private String routeId;
	
	@Column(name="ROUTE_NAME")
	private String routeName;
	
	@Column(name="CAPACITY")
	private String capacity;
	
	@Column(name="FUEL_CAPACITY")
	private String fuelCapacity;
	
	@Column(name="START_TIME")
	private String startTime;
	
	@Column(name="END_TIME")
	private String endTime;

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	
	
	
}
