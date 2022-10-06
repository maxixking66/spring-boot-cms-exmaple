package com.maktabsharif74.cms.springbootcmsexmaple.init;

import com.maktabsharif74.cms.springbootcmsexmaple.domain.Admin;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.enumeration.Gender;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.enumeration.UserType;
import com.maktabsharif74.cms.springbootcmsexmaple.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final AdminService adminService;

    @PostConstruct
    public void initData() {
        initAdmin();
    }

    private void initAdmin() {
        if (adminService.count() == 0) {
            Admin admin = new Admin();
            admin.setFirstName("mohsen");
            admin.setLastName("asgari");
            admin.setUsername("mat");
            admin.setPassword("123456789");
            admin.setGender(Gender.MALE);
//            UserType.ADMIN.name() == "ADMIN"
            admin.setUserType(UserType.ADMIN.name());
            adminService.save(admin);
        }
    }
}
