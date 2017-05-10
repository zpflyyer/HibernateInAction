package com.pengfei.inheritence.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.persistence.Entity;

/**
 * Created by zhaopen on 4/23/2017.
 */
@Entity
@Setter
@Getter
@Component
@NoArgsConstructor
@DiscriminatorValue("顾客")
public class Customer extends Person{
    private String comments;

    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(name = "employee_id")
    @Cascade(CascadeType.ALL)
    private Employee employee;

    public Customer(String name,String gender,Integer age){
        super(name, gender, age);
    }
}
