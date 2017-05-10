package com.pengfei.joinedinheritence.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaopen on 4/23/2017.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_manager")
public class Manager extends Employee {
    private String department;

    @OneToMany(targetEntity = Employee.class,mappedBy = "manager")
    private Set<Employee> employeeSet = new HashSet<Employee>();

    public Manager(String name,String gender,Integer age){
        super(name, gender, age);
    }
}
