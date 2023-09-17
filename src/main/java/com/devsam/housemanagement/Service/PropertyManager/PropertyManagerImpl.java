package com.devsam.housemanagement.Service.PropertyManager;

import com.devsam.housemanagement.Entity.PropertyManager;
import com.devsam.housemanagement.Repository.PropertyManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertyManagerImpl implements PropertyManagerService {
    @Autowired
    private PropertyManagerRepository propertyManagerRepository;

    @Override
    public PropertyManager save(PropertyManager propertyManager) {
        return (PropertyManager) propertyManagerRepository.save(propertyManager);
    }

    @Override
    public List<PropertyManager> getAll() {
        return propertyManagerRepository.findAll();
    }

    @Override
    public PropertyManager getById(Long id) {
        return propertyManagerRepository.findById(id).get();
    }

    @Override
    public PropertyManager getByFirstName(String firstName) {
        return (PropertyManager) propertyManagerRepository.findByFirstName(firstName);
    }
}
