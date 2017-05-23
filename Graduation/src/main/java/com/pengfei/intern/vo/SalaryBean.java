package com.pengfei.intern.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SalaryBean
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	private int id;
	private String real_name;
	//����
	private double amount;
	private String month;

	public SalaryBean(double amount,String month,double base){
		this.amount = amount;
		this.month = month;
		this.base = base;
	}
	public SalaryBean(int id,String real_name,double amount,double base){
		this.id = id;
		this.real_name = real_name;
		this.amount = amount;
		this.base = base;
	}
	//��������
	private double base;
	//���ֿ۹���
	private double sick_pay;
	private double issue_pay;
	private double work_pay;
	private double late_pay;
	private double early_pay;
	private double unAttend_pay;

}