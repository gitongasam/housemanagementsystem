package com.devsam.housemanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RentalProperty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    private int numberOfRooms;
    private double rentAmount;
    @ManyToOne
    @JoinColumn(name = "property_manager_id")
    private PropertyManager propertyManager;


}
