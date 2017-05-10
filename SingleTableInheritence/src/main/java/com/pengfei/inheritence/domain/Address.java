package com.pengfei.inheritence.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Parent;
import org.springframework.stereotype.Component;

import javax.persistence.Embeddable;

/**
 * Created by zhaopen on 4/23/2017.
 */
@Getter
@Setter
@Embeddable
@NoArgsConstructor
@Component
public class Address {
    private String province;
    private String city;

    public Address(String province, String city){
        this.province = province;
        this.city = city;
    }
    @Parent
    @JsonBackReference
    private Person person;
}
