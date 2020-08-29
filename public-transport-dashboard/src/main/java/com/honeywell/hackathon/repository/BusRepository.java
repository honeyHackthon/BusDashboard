package com.honeywell.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.honeywell.hackathon.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, String> {

	@Query("select * from Bus where busId=:busId")
	Bus getFuelConsumption(String busId);


}
