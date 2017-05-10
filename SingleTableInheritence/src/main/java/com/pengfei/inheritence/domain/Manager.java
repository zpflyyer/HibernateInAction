package com.pengfei.inheritence.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaopen on 4/23/2017.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Component
@DiscriminatorValue("经理")
public class Manager extends Employee {
    private String department;

    @OneToMany(targetEntity = Employee.class,mappedBy = "manager")
    private Set<Employee> employeeSet = new HashSet<Employee>();

    public Manager(String name,String gender,Integer age){
        super(name, gender, age);
    }
}
