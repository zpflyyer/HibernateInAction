package com.pengfei.bidirectional.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaopen on 4/22/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "tb_teacher")
public class Teacher
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer age;

    @ManyToMany(targetEntity = Person.class)
    @JoinTable(
            name = "tb_person_teacher",
            joinColumns = @JoinColumn(name = "teacher_id",nullable = false),
            inverseJoinColumns = @JoinColumn(name = "person_id",nullable = false))
    private Set<Person> personSet = new HashSet<Person>();
}
