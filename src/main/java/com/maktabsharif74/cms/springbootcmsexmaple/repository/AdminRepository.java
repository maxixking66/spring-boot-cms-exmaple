package com.maktabsharif74.cms.springbootcmsexmaple.repository;

import com.maktabsharif74.cms.springbootcmsexmaple.domain.Admin;
import com.maktabsharif74.cms.springbootcmsexmaple.repository.base.BaseUserRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends BaseUserRepository<Admin> {

    @Override
    Admin getByUsername(String username);
}
