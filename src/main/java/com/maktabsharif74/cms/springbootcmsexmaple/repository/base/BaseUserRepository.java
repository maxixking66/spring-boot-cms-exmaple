package com.maktabsharif74.cms.springbootcmsexmaple.repository.base;

import com.maktabsharif74.cms.springbootcmsexmaple.base.repository.BaseEntityRepository;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.User;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseUserRepository<T extends User> extends BaseEntityRepository<T, Long> {

    T getByUsername(String username);

    T getByUsernameAndPassword(String username, String password);

    <P> P getByUsername(String username, Class<P> pClass);

}
