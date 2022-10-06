package com.maktabsharif74.cms.springbootcmsexmaple.service.impl;

import com.maktabsharif74.cms.springbootcmsexmaple.base.exception.BadRequestRuntimeException;
import com.maktabsharif74.cms.springbootcmsexmaple.base.exception.EntityNotFoundRuntimeException;
import com.maktabsharif74.cms.springbootcmsexmaple.base.service.impl.BaseEntityServiceImpl;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.MediaCategory;
import com.maktabsharif74.cms.springbootcmsexmaple.repository.MediaCategoryRepository;
import com.maktabsharif74.cms.springbootcmsexmaple.service.MediaCategoryService;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra.MediaCategoryOperationDTO;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra.MediaCategoryUpdateDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class MediaCategoryServiceImpl extends BaseEntityServiceImpl<MediaCategory, Long, MediaCategoryRepository>
        implements MediaCategoryService {

    public MediaCategoryServiceImpl(MediaCategoryRepository repository) {
        super(repository);
    }

    @Override
    @Transactional
    public MediaCategory save(MediaCategoryOperationDTO categoryDTO) {
        if (repository.existsByTitle(categoryDTO.getTitle())) {
            throw new BadRequestRuntimeException("duplicate category title");
        }

        MediaCategory mediaCategory = new MediaCategory(categoryDTO.getTitle());

        if (categoryDTO.getParentId() != null) {
            Optional<MediaCategory> optionalParent = repository.findById(categoryDTO.getParentId());
            mediaCategory.setParent(
                    optionalParent.orElseThrow(
                            () -> new EntityNotFoundRuntimeException(
                                    "parent category not found"
                            )
                    )
            );
        }

        return repository.save(mediaCategory);
    }

    @Override
    @Transactional
    public MediaCategory update(MediaCategoryUpdateDTO categoryDTO) {
        MediaCategory mediaCategory = repository.findById(categoryDTO.getId())
                .orElseThrow(
                        () -> new EntityNotFoundRuntimeException("category not found")
                );
        if (!mediaCategory.getTitle().equals(categoryDTO.getTitle())) {
            if (repository.existsByTitle(categoryDTO.getTitle())) {
                throw new BadRequestRuntimeException("duplicate category title");
            }
        }

        mediaCategory.setTitle(categoryDTO.getTitle());

        if (categoryDTO.getParentId() != null) {

            Optional<MediaCategory> optionalParent = repository.findById(categoryDTO.getParentId());
            mediaCategory.setParent(
                    optionalParent.orElseThrow(
                            () -> new EntityNotFoundRuntimeException(
                                    "parent category not found"
                            )
                    )
            );

        } else {
            mediaCategory.setParent(null);
        }

        return repository.save(mediaCategory);
    }
}
