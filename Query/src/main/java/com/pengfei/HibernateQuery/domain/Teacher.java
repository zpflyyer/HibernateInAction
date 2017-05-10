package com.pengfei.HibernateQuery.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/22/2017.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_teacher")
public class Teacher {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "first_name",column = @Column(name = "t_firstname",nullable = false)),
            @AttributeOverride(name = "last_name",column = @Column(name = "t_lastname",nullable = false))
    })
    private Name name;

    private Integer age;


}
