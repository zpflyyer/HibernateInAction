package com.pengfei.perclass.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/23/2017.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "tb_person")
public class Person {
    @Id
    @GenericGenerator(name = "hilo_generator",strategy = "hilo")
    @GeneratedValue(generator = "hilo_generator")
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
