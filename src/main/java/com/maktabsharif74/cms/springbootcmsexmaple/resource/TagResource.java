package com.maktabsharif74.cms.springbootcmsexmaple.resource;

import com.maktabsharif74.cms.springbootcmsexmaple.base.resource.BaseResource;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.Tag;
import com.maktabsharif74.cms.springbootcmsexmaple.mapper.TagMapper;
import com.maktabsharif74.cms.springbootcmsexmaple.service.TagService;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.TagDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tag")
public class TagResource extends BaseResource<Tag, TagDTO, Long, TagService, TagMapper> {

    public TagResource(TagService baseService, TagMapper baseMapper) {
        super(baseService, baseMapper);
    }
}
