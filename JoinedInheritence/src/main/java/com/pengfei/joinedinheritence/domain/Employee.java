package com.pengfei.joinedinheritence.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaopen on 4/23/2017.
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "tb_employee")
public class Employee extends Person{
    private String title;
    private String salary;

    @ManyToOne(targetEntity = Manager.class)
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @OneToMany(targetEntity = Customer.class,mappedBy = "employee")
    private Set<Customer> customerSet = new HashSet<Customer>();

    public Employee(String name,String gender,Integer age){
        super(name,gender,age);
    }
}
