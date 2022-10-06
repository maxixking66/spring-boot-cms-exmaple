package com.maktabsharif74.cms.springbootcmsexmaple.service;

import com.maktabsharif74.cms.springbootcmsexmaple.base.service.BaseEntityService;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.MediaCategory;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra.MediaCategoryOperationDTO;

public interface MediaCategoryService extends BaseEntityService<MediaCategory, Long> {

    MediaCategory save(MediaCategoryOperationDTO categoryDTO);
}
