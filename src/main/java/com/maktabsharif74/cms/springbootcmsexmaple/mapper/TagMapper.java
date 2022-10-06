package com.maktabsharif74.cms.springbootcmsexmaple.mapper;

import com.maktabsharif74.cms.springbootcmsexmaple.base.mapper.BaseMapper;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.Tag;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.TagDTO;
import org.mapstruct.Mapper;

@Mapper
public interface TagMapper extends BaseMapper<Tag, TagDTO, Long> {
}
