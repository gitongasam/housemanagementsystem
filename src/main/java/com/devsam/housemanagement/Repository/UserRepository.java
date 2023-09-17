package com.devsam.housemanagement.Repository;

import com.devsam.housemanagement.Entity.PropertyManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<PropertyManager, Long> {




    Optional<PropertyManager> findByEmail(String email);

    Optional<Object> findByUsername(String username);
}
