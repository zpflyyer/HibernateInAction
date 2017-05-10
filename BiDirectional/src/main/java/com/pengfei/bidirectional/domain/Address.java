package com.pengfei.bidirectional.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/22/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "tb_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String province;
    private String city;

    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "person_id",nullable = false)
    private Person person;
}
