package com.devsam.housemanagement.Controller;

import com.devsam.housemanagement.Service.RentalProperty.RentalProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rental-properties")
public class RentalPropertyController {

    @Autowired
    private RentalProperty rentalPropertyService;

    @PostMapping
    public RentalProperty saveRentalProperty(@RequestBody RentalProperty rentalProperty) {
        return rentalPropertyService.save(rentalProperty);
    }

    // Get all rental properties
    @GetMapping
    public List<com.devsam.housemanagement.Entity.RentalProperty> getAllRentalProperties() {
        return rentalPropertyService.getAllRentalProperties();
    }

    // Get a rental property by ID
    @GetMapping("/{id}")
    public RentalProperty getRentalPropertyById(@PathVariable Long id) {
        return rentalPropertyService.getRentalPropertyById(id);
    }

    // Get rental properties by address
    @GetMapping("/by-address/{address}")
    public RentalProperty getRentalPropertiesByAddress(@PathVariable String address) {
        return rentalPropertyService.getRentalPropertiesByAddress(address);
    }
}

