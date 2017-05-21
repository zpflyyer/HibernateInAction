package com.pengfei.intern.domain;

import java.io.Serializable;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@DiscriminatorValue(value="1")
public class Intern extends Admin
	implements Serializable
{
	// Ա������
	@Column(name="emp_salary")
	private double salary;
	// ����ǰ��Ajax����
	@Transient
	private String response;
	// Ա����Ӧ�ľ���
	@JsonBackReference
	@ManyToOne(targetEntity=Manager.class)
	@JoinColumn(name="mgr_id")
	private Manager manager;

	// Ա����Ӧ�ĳ��ڼ�¼
	@JsonBackReference
	@OneToMany(targetEntity=Attend.class, mappedBy="employee")
	private Set<Attend> attends = new HashSet<>();

	// Ա����Ӧ�Ĺ���֧����¼
	@JsonBackReference
	@OneToMany(targetEntity=Payment.class, mappedBy="employee")
	private Set<Payment> payments = new HashSet<>();

	// Ա����Ӧ������
	@JsonBackReference
	@OneToMany(targetEntity=Job.class, mappedBy="intern")
	private Set<Job> jobSet = new HashSet<>();

}