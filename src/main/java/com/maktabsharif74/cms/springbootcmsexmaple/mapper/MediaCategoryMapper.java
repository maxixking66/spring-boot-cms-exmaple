package com.maktabsharif74.cms.springbootcmsexmaple.mapper;

import com.maktabsharif74.cms.springbootcmsexmaple.base.mapper.BaseMapper;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.MediaCategory;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.MediaCategoryDTO;
import org.mapstruct.Mapper;

@Mapper
public interface MediaCategoryMapper extends BaseMapper<MediaCategory, MediaCategoryDTO, Long> {
}
