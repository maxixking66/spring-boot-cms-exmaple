package com.maktabsharif74.cms.springbootcmsexmaple.resource;

import com.maktabsharif74.cms.springbootcmsexmaple.base.exception.EntityNotFoundRuntimeException;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.MediaCategory;
import com.maktabsharif74.cms.springbootcmsexmaple.mapper.MediaCategoryMapper;
import com.maktabsharif74.cms.springbootcmsexmaple.service.MediaCategoryService;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.MediaCategoryDTO;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra.MediaCategoryOperationDTO;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra.MediaCategoryUpdateDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/media-category")
@RequiredArgsConstructor
public class MediaCategoryResource {

    private final MediaCategoryService mediaCategoryService;

    private final MediaCategoryMapper mediaCategoryMapper;

    @GetMapping
    public ResponseEntity<MediaCategoryDTO> getById(@RequestParam Long id) {
        Optional<MediaCategory> optionalMediaCategory = mediaCategoryService.findById(id);
        return ResponseEntity.ok(
                mediaCategoryMapper.convertEntityToDTO(
                        optionalMediaCategory.orElseThrow(
                                () -> new EntityNotFoundRuntimeException("category with id : " + id + ", not found")
                        )
                )
        );
    }

    //    سرویس ایجاد دسته بندی
//    نیازمندی‌ها: بررسی یونیک بودن تایتل دسته بندی و مشخص کردن پدر دسته‌بندی در صورت نیاز
    @PostMapping
    public ResponseEntity<MediaCategoryDTO> save(@RequestBody @Valid MediaCategoryOperationDTO categoryDTO) {

        MediaCategory mediaCategory = mediaCategoryService.save(categoryDTO);
        return ResponseEntity.ok(
                mediaCategoryMapper.convertEntityToDTO(
                        mediaCategory
                )
        );

    }

    @PutMapping
    public ResponseEntity<MediaCategoryDTO> update(@RequestBody @Valid MediaCategoryUpdateDTO categoryDTO) {

        MediaCategory mediaCategory = mediaCategoryService.update(categoryDTO);
        return ResponseEntity.ok(
                mediaCategoryMapper.convertEntityToDTO(
                        mediaCategory
                )
        );

    }
}
