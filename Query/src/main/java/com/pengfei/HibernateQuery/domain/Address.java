package com.pengfei.HibernateQuery.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/21/2017.
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "tb_address")
public class Address {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String province;
    private String city;
}
