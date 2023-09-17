package com.devsam.housemanagement.Controller;

import com.devsam.housemanagement.Entity.Property;
import com.devsam.housemanagement.Service.property.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    private final PropertyService propertyService;

    @Autowired
    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @PostMapping("/")
    public Property createProperty(@RequestBody Property property) {
        return propertyService.createProperty(property);
    }

    @PutMapping("/{propertyId}")
    public Property updateProperty(@PathVariable Long propertyId, @RequestBody Property property) {
        property.setId(propertyId); // Ensure the property ID is set
        return propertyService.updateProperty(property);
    }

    @DeleteMapping("/{propertyId}")
    public void deleteProperty(@PathVariable Long propertyId) {
        propertyService.deleteProperty(propertyId);
    }

    @GetMapping("/{propertyId}")
    public Property getPropertyById(@PathVariable Long propertyId) {
        return propertyService.getPropertyById(propertyId);
    }

    @GetMapping("/all")
    public List<Property> getAllProperties() {
        return propertyService.getAllProperties();
    }
    @GetMapping("/total")
    public long getTotalPropertiesCount() {
        return propertyService.getTotalPropertiesCount();
    }
}
