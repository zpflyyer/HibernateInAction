package com.pengfei.uni_irectional.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/21/2017.
 */
@Getter
@Setter
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
