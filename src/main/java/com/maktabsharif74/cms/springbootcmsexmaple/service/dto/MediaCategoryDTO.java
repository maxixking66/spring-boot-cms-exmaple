package com.maktabsharif74.cms.springbootcmsexmaple.service.dto;

import com.maktabsharif74.cms.springbootcmsexmaple.base.service.dto.BaseDTO;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra.MediaCategoryNoChildDTO;
import com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra.MediaCategoryNoParentDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MediaCategoryDTO extends BaseDTO<Long> {

    private String title;

    private MediaCategoryNoChildDTO parent;

    private Set<MediaCategoryNoParentDTO> childrenCategories = new HashSet<>();
}


