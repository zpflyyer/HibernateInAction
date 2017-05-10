package com.pengfei.HibernateQuery.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/22/2017.
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "tb_toy")
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer age;
}
