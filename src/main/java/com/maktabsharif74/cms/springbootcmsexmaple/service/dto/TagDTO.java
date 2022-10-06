package com.maktabsharif74.cms.springbootcmsexmaple.service.dto;

import com.maktabsharif74.cms.springbootcmsexmaple.base.service.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TagDTO extends BaseDTO<Long> {

    private String title;
}
