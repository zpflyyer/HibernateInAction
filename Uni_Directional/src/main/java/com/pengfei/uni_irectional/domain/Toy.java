package com.pengfei.uni_irectional.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/22/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "tb_toy")
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer age;
}
