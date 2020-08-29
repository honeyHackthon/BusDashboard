package com.honeywell.hackathon.repository;

import com.honeywell.hackathon.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LocationRepository extends JpaRepository<Location,String> {

    @Query("select * from Location where busId=:busId")
    Location getLocationByBus(String busId);
}
