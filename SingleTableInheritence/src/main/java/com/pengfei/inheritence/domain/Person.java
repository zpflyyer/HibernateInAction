package com.pengfei.inheritence.domain;

import lombok.*;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/23/2017.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Component
@DiscriminatorColumn(name = "person_type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("普通人")
@Table(name = "tb_person")
@FilterDef(name = "ageFilter",
        parameters = {@ParamDef(name = "AGE",type = "int")})
@Filter(name = "ageFilter"
        ,condition = "age <= :AGE")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Address address;

    private String name;
    private String gender;
    private Integer age;

    public Person(String name,String gender,Integer age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
