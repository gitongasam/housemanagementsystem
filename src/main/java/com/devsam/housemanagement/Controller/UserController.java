package com.devsam.housemanagement.Controller;

import com.devsam.housemanagement.Config.JWTGenerator;
import com.devsam.housemanagement.Entity.AuthResponseDTO;
import com.devsam.housemanagement.Entity.LoginDto;
import com.devsam.housemanagement.Entity.PropertyManager;
import com.devsam.housemanagement.Repository.UserRepository;
import com.devsam.housemanagement.Service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;
import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:3001")

public class UserController {

    private final UserService userService;

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Autowired
    private JWTGenerator jwtGenerator;

    @PostMapping("/register")
    public PropertyManager createUser(@RequestBody PropertyManager user) {
        return userService.createUser(user);
    }

    @PutMapping("/{userId}")
    public PropertyManager updateUser(@PathVariable Long userId, @RequestBody PropertyManager user) {
        user.setId(userId); // Ensure the user ID is set
        return userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("/{userId}")
    public PropertyManager getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/all")
    public List<PropertyManager> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/total-users")

    public ResponseEntity<List<PropertyManager>> getTotalUsers(@RequestParam(defaultValue = "10") int count) {
        Pageable pageable = PageRequest.of(0, count); // You can change the page and count as needed
        Page<PropertyManager> userPage = userRepository.findAll(pageable);
        List<PropertyManager> users = userPage.getContent();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/total")
    public ResponseEntity<Long> getTotalUsers() {
        long totalUsers = userRepository.count();
        return ResponseEntity.ok(totalUsers);
    }
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getUsername(),
                        loginDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);
        return new ResponseEntity<>(new AuthResponseDTO(token), HttpStatus.OK);
    }
}
