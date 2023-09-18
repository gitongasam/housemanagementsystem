package com.devsam.housemanagement.Service.Tenant;

import com.devsam.housemanagement.Entity.Tenants;

import java.util.List;

public interface TenantService {
    Tenants save(Tenants tenant);

    List<Tenants> getAllTenants();

    Tenants getTenantById(Long id);

    Tenants updateTenant(Long id, Tenants updatedTenant);

    void deleteTenant(Long id);
}
