package com.pengfei.intern.domain;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name="salary_tb")
public class Payment
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	// 标识属性
	@Id @Column(name="pay_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="pay_month", nullable=false, length=50)
	private String payMonth;
	// 发薪的数量
	@Column(name="pay_amount", nullable=false)
	private double amount;
	// 领薪的员工
	@ManyToOne(targetEntity=Intern.class)
	@JoinColumn(name="emp_id", nullable=false)
	private Intern employee;

}