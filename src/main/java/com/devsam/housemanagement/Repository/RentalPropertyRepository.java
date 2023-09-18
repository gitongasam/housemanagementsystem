package com.devsam.housemanagement.Repository;

import com.devsam.housemanagement.Entity.RentalProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalPropertyRepository extends JpaRepository<RentalProperty,Long> {
    com.devsam.housemanagement.Service.RentalProperty.RentalProperty findByAddress(String address);
}
