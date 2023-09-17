package com.devsam.housemanagement.Service.PropertyManager;

import com.devsam.housemanagement.Entity.PropertyManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PropertyManagerService {
    PropertyManager save(PropertyManager propertyManager);

    List<PropertyManager> getAll();

    PropertyManager getById(Long id);

    PropertyManager getByFirstName(String firstName);
}
