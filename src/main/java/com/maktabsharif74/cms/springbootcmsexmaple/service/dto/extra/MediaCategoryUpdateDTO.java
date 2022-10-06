package com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MediaCategoryUpdateDTO extends MediaCategoryOperationDTO {

    @NotNull
    private Long id;
}
