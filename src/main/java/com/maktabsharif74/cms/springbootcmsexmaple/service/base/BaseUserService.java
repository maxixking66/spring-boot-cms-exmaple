package com.maktabsharif74.cms.springbootcmsexmaple.service.base;

import com.maktabsharif74.cms.springbootcmsexmaple.base.service.BaseEntityService;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.User;

public interface BaseUserService<T extends User> extends BaseEntityService<T, Long> {

    T getByUsername(String username);

    T getByUsernameAndPassword(String username, String password);

    <P> P getByUsername(String username, Class<P> pClass);
}
