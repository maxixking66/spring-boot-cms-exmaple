package com.maktabsharif74.cms.springbootcmsexmaple.repository;

import com.maktabsharif74.cms.springbootcmsexmaple.base.repository.BaseEntityRepository;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.Tag;

public interface TagRepository extends BaseEntityRepository<Tag, Long> {

    boolean existsByTitle(String title);

    boolean existsByTitleAndIdIsNot(String title, Long id);

}
