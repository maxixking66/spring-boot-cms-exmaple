package com.maktabsharif74.cms.springbootcmsexmaple.domain;

import com.maktabsharif74.cms.springbootcmsexmaple.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = MediaCategory.TABLE_NAME)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MediaCategory extends BaseEntity<Long> {

    public static final String TABLE_NAME = "media_category";
    public static final String PARENT_ID = "parent_id";

    private String title;

    @ManyToOne
    @JoinColumn(name = PARENT_ID)
    private MediaCategory parent;

    @OneToMany
    @JoinColumn(name = PARENT_ID)
//    @OneToMany(mappedBy = "parent")
    private Set<MediaCategory> childrenCategories = new HashSet<>();

    public MediaCategory(Long aLong) {
        super(aLong);
    }

    public MediaCategory(String title) {
        this.title = title;
    }
}


