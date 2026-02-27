package com.linkedin.users_service.repository.user;

import com.linkedin.users_service.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
    Boolean existsByName(String name);
}
