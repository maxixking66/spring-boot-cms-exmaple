package com.maktabsharif74.cms.springbootcmsexmaple.repository;

import com.maktabsharif74.cms.springbootcmsexmaple.base.repository.BaseEntityRepository;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.MediaCategory;

public interface MediaCategoryRepository extends BaseEntityRepository<MediaCategory, Long> {

    boolean existsByTitle(String title);
}
