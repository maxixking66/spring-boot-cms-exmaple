package com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra;

import com.maktabsharif74.cms.springbootcmsexmaple.base.service.dto.BaseDTO;
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
public class MediaCategoryNoParentDTO extends BaseDTO<Long> {

    private String title;

    private Set<MediaCategoryNoParentDTO> childrenCategories = new HashSet<>();
}


