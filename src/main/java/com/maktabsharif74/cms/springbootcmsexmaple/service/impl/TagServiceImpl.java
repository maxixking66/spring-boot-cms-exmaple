package com.maktabsharif74.cms.springbootcmsexmaple.service.impl;

import com.maktabsharif74.cms.springbootcmsexmaple.base.exception.BadRequestRuntimeException;
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

    @Override
    public Tag save(Tag tag) {

        if (tag.getTitle() == null || tag.getTitle().isEmpty()) {
            throw new BadRequestRuntimeException("title is empty");
        }

        if (tag.getId() == null) {
            if (repository.existsByTitle(tag.getTitle())) {
                throw new BadRequestRuntimeException("duplicate tag title");
            }
        } else {
            if (repository.existsByTitleAndIdIsNot(tag.getTitle(), tag.getId())) {
                throw new BadRequestRuntimeException("duplicate tag title");
            }
        }
        return super.save(tag);
    }
}
