package com.devsam.housemanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PropertyManager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String idNumber;
    @OneToMany(mappedBy = "propertyManager", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<RentalProperty> rentalProperties = new HashSet<>();

}
