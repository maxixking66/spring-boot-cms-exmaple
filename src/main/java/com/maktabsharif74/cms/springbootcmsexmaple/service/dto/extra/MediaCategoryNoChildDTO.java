package com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra;

import com.maktabsharif74.cms.springbootcmsexmaple.base.service.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MediaCategoryNoChildDTO extends BaseDTO<Long> {

    private String title;

    private MediaCategoryNoChildDTO parent;

}


