package com.maktabsharif74.cms.springbootcmsexmaple.service.impl;

import com.maktabsharif74.cms.springbootcmsexmaple.domain.User;
import com.maktabsharif74.cms.springbootcmsexmaple.repository.UserRepository;
import com.maktabsharif74.cms.springbootcmsexmaple.service.UserService;
import com.maktabsharif74.cms.springbootcmsexmaple.service.base.impl.BaseUserServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends BaseUserServiceImpl<User, UserRepository> implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}
