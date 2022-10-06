package com.maktabsharif74.cms.springbootcmsexmaple.service.base.impl;

import com.maktabsharif74.cms.springbootcmsexmaple.base.service.impl.BaseEntityServiceImpl;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.User;
import com.maktabsharif74.cms.springbootcmsexmaple.repository.base.BaseUserRepository;
import com.maktabsharif74.cms.springbootcmsexmaple.service.base.BaseUserService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public class BaseUserServiceImpl<T extends User, R extends BaseUserRepository<T>>
        extends BaseEntityServiceImpl<T, Long, R> implements BaseUserService<T> {

    public BaseUserServiceImpl(R repository) {
        super(repository);
    }

    @Override
    public T getByUsername(String username) {
        return repository.getByUsername(username);
    }

    @Override
    public T getByUsernameAndPassword(String username, String password) {
        return repository.getByUsernameAndPassword(username, password);
    }

    @Override
    public <P> P getByUsername(String username, Class<P> pClass) {
        return repository.getByUsername(username, pClass);
    }
}
