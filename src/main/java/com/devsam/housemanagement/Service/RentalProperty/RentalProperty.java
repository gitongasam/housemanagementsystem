package com.devsam.housemanagement.Service.RentalProperty;

import java.util.List;

public interface RentalProperty {

    List<com.devsam.housemanagement.Entity.RentalProperty> getAllRentalProperties();

    RentalProperty getRentalPropertyById(Long id);

    RentalProperty getRentalPropertiesByAddress(String address);

    RentalProperty save(RentalProperty rentalProperty);
}
