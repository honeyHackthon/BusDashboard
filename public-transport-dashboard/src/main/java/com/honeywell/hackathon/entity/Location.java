package com.honeywell.hackathon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="Location")
@AllArgsConstructor
public class Location implements Serializable {


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="BUS_ID",referencedColumnName = "busId")
    private Bus bus;

    @Column(name="LATTITUDE")
    private double lattitude;

    @Column(name="LONGITUDE")
    private double longitude;



}
