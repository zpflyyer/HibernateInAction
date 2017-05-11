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
	// ��ʶ����
	private Integer id;
	// Ա������
	@Column(name="emp_name", nullable=false, length=50 , unique=true)
	private String name;
	// Ա������
	@Column(name="emp_pass", nullable=false, length=50)
	private String pass;
	// Ա������
	@Column(name="emp_salary", nullable=false)
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

	// ����name��pass����дhashCode()����
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}
	// ����name��pass����дequals()������ֻҪname��pass��ͬ��Ա������Ϊ��ȡ�
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