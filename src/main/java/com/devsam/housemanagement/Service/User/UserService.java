package com.devsam.housemanagement.Service.User;

import com.devsam.housemanagement.Entity.PropertyManager;

import java.util.List;

public interface UserService {
    PropertyManager createUser(PropertyManager propertyManager);
    PropertyManager updateUser(PropertyManager propertyManager);
    void deleteUser(Long userId);
    PropertyManager getUserById(Long userId);
    List<PropertyManager> getAllUsers();
}
