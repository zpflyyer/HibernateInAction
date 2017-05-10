package com.pengfei.uni_irectional.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/22/2017.
 */
@Getter
@Setter
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
