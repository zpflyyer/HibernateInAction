package com.pengfei.intern.domain;
import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name="payment_inf")
public class Payment
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	// ��ʶ����
	@Id @Column(name="pay_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="pay_month", nullable=false, length=50)
	private String payMonth;
	// ��н������
	@Column(name="pay_amount", nullable=false)
	private double amount;
	// ��н��Ա��
	@ManyToOne(targetEntity=Employee.class)
	@JoinColumn(name="emp_id", nullable=false)
	private Employee employee;

}