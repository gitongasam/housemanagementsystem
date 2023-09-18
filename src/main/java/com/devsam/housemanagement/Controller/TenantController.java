package com.devsam.housemanagement.Controller;

import com.devsam.housemanagement.Entity.Tenants;
import com.devsam.housemanagement.Service.Tenant.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tenants") // Set a base URL for all tenant-related endpoints
public class TenantController {

    @Autowired
    private TenantService tenantService;

    @PostMapping
    public Tenants createTenant(@RequestBody Tenants tenant) {
        return tenantService.save(tenant);
    }

    // Example: Get all tenants
    @GetMapping
    public List<Tenants> getAllTenants() {
        return tenantService.getAllTenants();
    }

    @GetMapping("/{id}")
    public Tenants getTenantById(@PathVariable Long id) {
        return tenantService.getTenantById(id);
    }

    // Example: Update tenant information
    @PutMapping("/{id}")
    public Tenants updateTenant(@PathVariable Long id, @RequestBody Tenants updatedTenant) {
        return tenantService.updateTenant(id, updatedTenant);
    }

    // Example: Delete tenant by ID
    @DeleteMapping("/{id}")
    public void deleteTenant(@PathVariable Long id) {
        tenantService.deleteTenant(id);
    }
}
