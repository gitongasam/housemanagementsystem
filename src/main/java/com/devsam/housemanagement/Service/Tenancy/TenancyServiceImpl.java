package com.devsam.housemanagement.Service.Tenancy;

import com.devsam.housemanagement.Entity.Tenancy;
import com.devsam.housemanagement.Repository.TenancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenancyServiceImpl implements TenancyService {

    private final TenancyRepository tenancyRepository;

    @Autowired
    public TenancyServiceImpl(TenancyRepository tenancyRepository) {
        this.tenancyRepository = tenancyRepository;
    }

    @Override
    public Tenancy createTenancy(Tenancy tenancy) {
        return tenancyRepository.save(tenancy);
    }

    @Override
    public Tenancy updateTenancy(Tenancy tenancy) {
        return tenancyRepository.save(tenancy);
    }

    @Override
    public void deleteTenancy(Long tenancyId) {
        tenancyRepository.deleteById(tenancyId);
    }

    @Override
    public Tenancy getTenancyById(Long tenancyId) {
        return tenancyRepository.findById(tenancyId).orElse(null);
    }

    @Override
    public List<Tenancy> getAllTenancies() {
        return tenancyRepository.findAll();
    }
}
