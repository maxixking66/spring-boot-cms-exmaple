package com.maktabsharif74.cms.springbootcmsexmaple.service.impl;

import com.maktabsharif74.cms.springbootcmsexmaple.domain.Admin;
import com.maktabsharif74.cms.springbootcmsexmaple.repository.AdminRepository;
import com.maktabsharif74.cms.springbootcmsexmaple.service.AdminService;
import com.maktabsharif74.cms.springbootcmsexmaple.service.base.impl.BaseUserServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AdminServiceImpl extends BaseUserServiceImpl<Admin, AdminRepository>
        implements AdminService {

    public AdminServiceImpl(AdminRepository repository) {
        super(repository);
    }
}
