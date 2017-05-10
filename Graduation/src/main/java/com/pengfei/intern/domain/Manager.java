package com.pengfei.intern.domain;

import java.io.Serializable;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
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
	extends Employee implements Serializable
{
	private static final long serialVersionUID = 48L;
	// �þ������Ĳ���
	@Column(name="dept_name", length=50)
	private String dept;
	// �þ����Ӧ������Ա��
	@OneToMany(targetEntity=Employee.class, mappedBy="manager")
	private Set<Employee> employees = new HashSet<>();
	// �þ���ǩ�����������
	@OneToMany(targetEntity=CheckBack.class , mappedBy="manager")
	private Set<CheckBack> checks = new HashSet<>();
}