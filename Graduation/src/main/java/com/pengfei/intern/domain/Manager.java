package com.pengfei.intern.domain;

import java.io.Serializable;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@DiscriminatorValue(value="2")
public class Manager
	extends Intern implements Serializable
{
	private static final long serialVersionUID = 48L;
	// 该经理管理的部门
	@Column(name="dept_name", length=50)
	private String dept;
	// 该经理对应的所有员工
	@OneToMany(targetEntity=Intern.class, mappedBy="manager")
	private Set<Intern> employees = new HashSet<>();
	// 该经理签署的所有批复
	@OneToMany(targetEntity=CheckBack.class , mappedBy="manager")
	private Set<CheckBack> checks = new HashSet<>();
}