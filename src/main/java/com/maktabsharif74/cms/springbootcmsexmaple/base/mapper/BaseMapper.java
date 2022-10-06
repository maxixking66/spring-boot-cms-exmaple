package com.maktabsharif74.cms.springbootcmsexmaple.base.mapper;

import com.maktabsharif74.cms.springbootcmsexmaple.base.domain.BaseEntity;
import com.maktabsharif74.cms.springbootcmsexmaple.base.service.dto.BaseDTO;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<E extends BaseEntity<ID>, D extends BaseDTO<ID>, ID extends Serializable> {

    E convertDTOToEntity(D d);

    D convertEntityToDTO(E e);

    List<E> convertListDTOToEntityList(List<D> dtoList);

    List<D> convertListEntityToDTOList(List<E> entityList);

}
