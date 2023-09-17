package com.devsam.housemanagement.Repository;

import com.devsam.housemanagement.Entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
