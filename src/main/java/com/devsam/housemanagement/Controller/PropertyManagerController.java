package com.devsam.housemanagement.Controller;

import com.devsam.housemanagement.Entity.PropertyManager;
import com.devsam.housemanagement.Service.PropertyManager.PropertyManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("property-managers/")
@RequiredArgsConstructor
public class PropertyManagerController {

    @Autowired
    private PropertyManagerService propertyManagerService;

    @PostMapping("/")
     public PropertyManager saveManager(@RequestBody  PropertyManager propertyManager){
         return propertyManagerService.save(propertyManager);
     }

    @GetMapping("/all")
    public List<PropertyManager> getAllManagers() {
        return propertyManagerService.getAll();
    }

    @GetMapping("/{id}")
    public PropertyManager getManagerById(@PathVariable Long id) {
        return propertyManagerService.getById(id);
    }

    @GetMapping("/by-firstname/{firstName}")
    public PropertyManager getManagerByFirstName(@PathVariable String firstName) {
        return propertyManagerService.getByFirstName(firstName);
    }
}
