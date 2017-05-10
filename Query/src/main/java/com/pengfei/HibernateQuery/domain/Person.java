package com.pengfei.HibernateQuery.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaopen on 4/21/2017.
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "tb_person")
public class Person {

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "first_name",column = @Column(name = "p_firstname",nullable = false)),
            @AttributeOverride(name = "last_name",column = @Column(name = "p_lastname",nullable = false))
    })
    private Name name;

    private Integer age;

    @ManyToOne(targetEntity = Address.class,cascade = javax.persistence.CascadeType.ALL)
    @JoinColumn(name = "address_id")
    //    @Cascade(CascadeType.ALL)
    private Address address;

    @OneToOne(targetEntity = IdentifyCard.class)
    @JoinColumn(name = "ID_number",unique = true)
    @Cascade(CascadeType.ALL)
    private IdentifyCard id_card;

    @OneToMany(targetEntity = Toy.class)
    @JoinColumns({
            @JoinColumn(name = "firstname",referencedColumnName = "p_firstname",nullable = false),
            @JoinColumn(name = "lastname",referencedColumnName = "p_lastname",nullable = false)
    })
    @Cascade(CascadeType.ALL)
    private Set<Toy> toys = new HashSet<Toy>();


    //Hibernate总是会在持久化一个对象时将其内部的多对多连接表清空？
    @ManyToMany(targetEntity = Teacher.class)
    @JoinTable(
            name = "tb_person_teacher",
            joinColumns = {
            @JoinColumn(name = "personfirst",referencedColumnName = "p_firstname",nullable = false),
            @JoinColumn(name = "personlast",referencedColumnName = "p_lastname",nullable = false)
    },
            inverseJoinColumns = {
                    @JoinColumn(name = "teachfirst",referencedColumnName = "t_firstname",nullable = false),
                    @JoinColumn(name = "teachlast",referencedColumnName = "t_lastname",nullable = false)
            }
    )
    @Cascade(CascadeType.ALL)
    private Set<Teacher> teacherSet = new HashSet<Teacher>();

}
