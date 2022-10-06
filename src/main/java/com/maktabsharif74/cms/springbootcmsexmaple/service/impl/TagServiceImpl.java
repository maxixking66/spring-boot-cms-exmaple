package com.maktabsharif74.cms.springbootcmsexmaple.service.impl;

import com.maktabsharif74.cms.springbootcmsexmaple.base.service.impl.BaseEntityServiceImpl;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.Tag;
import com.maktabsharif74.cms.springbootcmsexmaple.repository.TagRepository;
import com.maktabsharif74.cms.springbootcmsexmaple.service.TagService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TagServiceImpl extends BaseEntityServiceImpl<Tag, Long, TagRepository> implements TagService {

    public TagServiceImpl(TagRepository repository) {
        super(repository);
    }
}
