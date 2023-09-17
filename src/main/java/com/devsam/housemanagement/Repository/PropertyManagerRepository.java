package com.devsam.housemanagement.Repository;

import com.devsam.housemanagement.Entity.PropertyManager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyManagerRepository extends JpaRepository<PropertyManager,Long> {

    List<Object> findByFirstName(String firstName);
}
