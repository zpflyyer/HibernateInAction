package com.pengfei.inheritence.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;
import org.springframework.stereotype.Component;

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
@Component
@DiscriminatorValue("雇员")
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
