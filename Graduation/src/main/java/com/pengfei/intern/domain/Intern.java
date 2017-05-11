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
@Table(name="intern_tb")
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@DiscriminatorColumn(name="emp_type"
	, discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue(value="1")
public class Intern
	implements Serializable
{
	private static final long serialVersionUID = 48L;

	@JsonBackReference
	@Id @Column(name="emp_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	// 标识属性
	private Integer id;
	// 员工姓名
	@Column(name="emp_name", nullable=false, length=50 , unique=true)
	private String name;
	// 员工密码
	@Column(name="emp_pass", nullable=false, length=50)
	private String pass;
	// 员工工资
	@Column(name="emp_salary", nullable=false)
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

	// 根据name、pass来重写hashCode()方法
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}
	// 根据name、pass来重写equals()方法，只要name、pass相同的员工即认为相等。
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Intern other = (Intern) obj;
		if (name == null)
		{
			if (other.name != null) return false;
		}
		else if (!name.equals(other.name)) return false;
		if (pass == null)
		{
			if (other.pass != null) return false;
		}
		else if (!pass.equals(other.pass)) return false;
		return true;
	}

	@Override
	public String toString(){
		return "name:" + name + "pass:" + pass + "salary:" + salary;
	}
}