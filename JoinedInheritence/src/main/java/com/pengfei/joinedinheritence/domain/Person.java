package com.pengfei.joinedinheritence.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/23/2017.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_person")
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
