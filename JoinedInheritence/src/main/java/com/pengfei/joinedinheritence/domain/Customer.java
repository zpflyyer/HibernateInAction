package com.pengfei.joinedinheritence.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;

/**
 * Created by zhaopen on 4/23/2017.
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "tb_customer")
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
