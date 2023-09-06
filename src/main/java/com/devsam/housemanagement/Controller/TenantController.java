package com.devsam.housemanagement.Controller;

import com.devsam.housemanagement.Entity.Tenancy;
import com.devsam.housemanagement.Service.Tenancy.TenancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tenants")
public class TenantController {

    @Autowired
    private final TenancyService tenantService;

    public TenantController(TenancyService tenantService) {
        this.tenantService = tenantService;
    }


    @PostMapping("/")
    public Tenancy createTenant(@RequestBody Tenancy tenancy) {
        return tenantService.createTenancy(tenancy);
    }

    @PutMapping("/{tenantId}")
    public Tenancy updateTenant(@PathVariable Long tenantId, @RequestBody Tenancy tenancy) {
        tenancy.setId(tenantId); // Ensure the tenant ID is set
        return tenantService.updateTenancy(tenancy);
    }

    @DeleteMapping("/{tenantId}")
    public void deleteTenant(@PathVariable Long tenantId) {
        tenantService.deleteTenancy(tenantId);
    }

    @GetMapping("/{tenantId}")
    public Tenancy getTenantById(@PathVariable Long tenantId) {
        return tenantService.getTenancyById(tenantId);
    }

    @GetMapping("/")
    public List<Tenancy> getAllTenants() {
        return tenantService.getAllTenancies();
    }
}
