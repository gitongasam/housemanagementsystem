package com.devsam.housemanagement.Service.User;

import com.devsam.housemanagement.Entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long userId);
    User getUserById(Long userId);
    List<User> getAllUsers();
}
