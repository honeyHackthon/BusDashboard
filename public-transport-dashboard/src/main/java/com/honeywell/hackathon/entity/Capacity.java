package com.honeywell.hackathon.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class Capacity implements Serializable {


        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name="BUS_ID",referencedColumnName = "busId")
        private Bus bus;

        @Column(name="capacity")
        private int capacity;
}
