package com.devsam.housemanagement.Service.RentalProperty;

import com.devsam.housemanagement.Repository.RentalPropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalPropertyImpl implements RentalProperty {
    @Autowired
    private RentalPropertyRepository rentalPropertyRepository;

    @Autowired
    public RentalPropertyImpl(RentalPropertyRepository rentalPropertyRepository) {
        this.rentalPropertyRepository = rentalPropertyRepository;
    }
    @Override
    public List<com.devsam.housemanagement.Entity.RentalProperty> getAllRentalProperties() {
        return rentalPropertyRepository.findAll();
    }

    @Override
    public RentalProperty getRentalPropertyById(Long id) {
        return (RentalProperty) rentalPropertyRepository.findById(id).get();
    }

    @Override
    public RentalProperty getRentalPropertiesByAddress(String address) {
        return rentalPropertyRepository.findByAddress(address);
    }

    @Override
    public RentalProperty save(RentalProperty rentalProperty) {
        return null;
    }


}
