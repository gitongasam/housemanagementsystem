package com.devsam.housemanagement.Service.Tenant;

import com.devsam.housemanagement.Entity.Tenants;
import com.devsam.housemanagement.Repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TenantServiceImp implements TenantService{
    @Autowired
    private TenantRepository tenantRepository;
    @Override
    public Tenants save(Tenants tenant) {
        return tenantRepository.save(tenant);
    }

    @Override
    public List<Tenants> getAllTenants() {
        return tenantRepository.findAll();
    }

    @Override
    public Tenants getTenantById(Long id) {
        return tenantRepository.findById(id).get();
    }

    public Tenants updateTenant(Long id, Tenants updatedTenant) {
        // Check if the tenant with the given ID exists in the database
        Optional<Tenants> existingTenantOptional = tenantRepository.findById(id);

        if (existingTenantOptional.isPresent()) {
            // Tenant with the given ID exists
            Tenants existingTenant = existingTenantOptional.get();

            // Update the tenant's information based on the updatedTenant object
            existingTenant.setFirstName(updatedTenant.getFirstName());
            existingTenant.setLastName(updatedTenant.getLastName());
            existingTenant.setEmail(updatedTenant.getEmail());
            existingTenant.setPhoneNumber(updatedTenant.getPhoneNumber());

            // Save the updated tenant to the database
            return tenantRepository.save(existingTenant);
        } else {
            throw new TenantNotFoundException("Tenant not found with ID: " + id);
        }
    }

    @Override
    public void deleteTenant(Long id) {
        tenantRepository.deleteAllById(Collections.singleton(id));
    }
}
