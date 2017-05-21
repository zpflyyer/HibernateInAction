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
	// 员工工资
	@Column(name="emp_salary")
	private double salary;
	// 反馈前端Ajax请求
	@Transient
	private String response;
	// 员工对应的经理
	@JsonBackReference
	@ManyToOne(targetEntity=Manager.class)
	@JoinColumn(name="mgr_id")
	private Manager manager;

	// 员工对应的出勤记录
	@JsonBackReference
	@OneToMany(targetEntity=Attend.class, mappedBy="employee")
	private Set<Attend> attends = new HashSet<>();

	// 员工对应的工资支付记录
	@JsonBackReference
	@OneToMany(targetEntity=Payment.class, mappedBy="employee")
	private Set<Payment> payments = new HashSet<>();

	// 员工对应的任务
	@JsonBackReference
	@OneToMany(targetEntity=Job.class, mappedBy="intern")
	private Set<Job> jobSet = new HashSet<>();

}