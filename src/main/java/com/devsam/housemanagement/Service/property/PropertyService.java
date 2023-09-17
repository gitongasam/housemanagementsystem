package com.devsam.housemanagement.Service.property;
import com.devsam.housemanagement.Entity.Property;

import java.util.List;

public interface PropertyService {
    Property createProperty(Property property);
    Property updateProperty(Property property);
    void deleteProperty(Long propertyId);
    Property getPropertyById(Long propertyId);
    List<Property> getAllProperties();
}
