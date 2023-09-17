package com.devsam.housemanagement.Service.User;

import com.devsam.housemanagement.Entity.PropertyManager;
import com.devsam.housemanagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public PropertyManager createUser(PropertyManager propertyManager) {
        propertyManager.setPassword(passwordEncoder.encode(propertyManager.getPassword()));
        return userRepository.save(propertyManager);
    }

    @Override
    public PropertyManager updateUser(PropertyManager user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public PropertyManager getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public List<PropertyManager> getAllUsers() {
        return userRepository.findAll();
    }
}

