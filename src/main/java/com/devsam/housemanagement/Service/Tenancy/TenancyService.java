package com.devsam.housemanagement.Service.Tenancy;

import java.util.List;

public interface TenancyService {
    Tenancy createTenancy(Tenancy tenancy);
    Tenancy updateTenancy(Tenancy tenancy);
    void deleteTenancy(Long tenancyId);
    Tenancy getTenancyById(Long tenancyId);
    List<Tenancy> getAllTenancies();
}

