package com.devsam.housemanagement.Service.Tenant;

public class TenantNotFoundException extends RuntimeException {

    public TenantNotFoundException(String message) {
        super(message);
    }

}
