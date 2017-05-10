package com.pengfei.bidirectional.domain;

import com.pengfei.bidirectional.domain.Address;
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
@Table(name = "tb_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer age;

    @OneToMany(targetEntity = Address.class,mappedBy = "person")
    private Set<Address> addressSet = new HashSet<Address>();

    @ManyToMany(targetEntity = Teacher.class,mappedBy = "personSet")
//    @JoinTable(
//            name = "tb_person_teacher",
//            inverseJoinColumns = @JoinColumn(name = "teacher_id",nullable = false),
//            joinColumns = @JoinColumn(name = "person_id",nullable = false))
    private Set<Teacher> teacherSet = new HashSet<Teacher>();
}
