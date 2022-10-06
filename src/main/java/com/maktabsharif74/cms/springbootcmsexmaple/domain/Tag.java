package com.maktabsharif74.cms.springbootcmsexmaple.domain;

import com.maktabsharif74.cms.springbootcmsexmaple.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Tag.TABLE_NAME)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Tag extends BaseEntity<Long> {

    public static final String TABLE_NAME = "tag";

    @Column(unique = true)
    private String title;
}
