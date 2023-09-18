package com.devsam.housemanagement.Repository;

import com.devsam.housemanagement.Entity.Tenants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenants,Long> {
}
