package com.maktabsharif74.cms.springbootcmsexmaple.domain;

import com.maktabsharif74.cms.springbootcmsexmaple.base.domain.BaseEntity;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = User.TABLE_NAME)
@Inheritance
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity<Long> {

    public static final String TABLE_NAME = "user_tbl";

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String nationalCode;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String userType;

    public User(Long aLong, String firstName, String username, String userType) {
        super(aLong);
        this.firstName = firstName;
        this.username = username;
        this.userType = userType;
    }
}
