package com.pengfei.perclass.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Parent;

import javax.persistence.Embeddable;

/**
 * Created by zhaopen on 4/23/2017.
 */
@Getter
@Setter
@Embeddable
@NoArgsConstructor
public class Address {
    private String province;
    private String city;

    public Address(String province, String city){
        this.province = province;
        this.city = city;
    }
    @Parent
    private Person person;
}
