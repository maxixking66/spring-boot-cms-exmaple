package com.maktabsharif74.cms.springbootcmsexmaple.service.dto.extra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MediaCategoryOperationDTO implements Serializable {

    @NotBlank
    private String title;

    private Long parentId;
}
