package com.pengfei.intern.domain;

import java.io.Serializable;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
	// �þ������Ĳ���
	@Column(name="dept_name", length=50)
	private String dept;
	// �þ����Ӧ������Ա��
	@OneToMany(targetEntity=Intern.class, mappedBy="manager")
	private Set<Intern> employees = new HashSet<>();
	// �þ���ǩ�����������
	@OneToMany(targetEntity=CheckBack.class , mappedBy="manager")
	private Set<CheckBack> checks = new HashSet<>();
	//�þ����õ�ȫ������
	@JsonBackReference
	@OneToMany(targetEntity = Task.class,mappedBy = "manager")
	private Set<Task> taskSet = new HashSet<>();
}