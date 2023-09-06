package com.devsam.housemanagement.Service.Role;

import com.devsam.housemanagement.Entity.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);
    Role getRoleById(Long roleId);
    List<Role> getAllRoles();
}
