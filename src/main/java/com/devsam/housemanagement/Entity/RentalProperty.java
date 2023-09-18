package com.devsam.housemanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RentalProperty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    private float rentAmount;
    private String numberOfRooms;

    @ManyToOne
    //Adding the name
    @JoinColumn(name = "property_id")
    private PropertyManager propertyManagers;

}
