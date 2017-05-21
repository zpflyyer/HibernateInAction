package com.pengfei.intern.vo;

import lombok.*;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ItrBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	private String empName;
	private String empPass;
	private double amount;
	private String mgr;
	private String dept;
	private List<AttendBean> attendBeans;
	private String tel;
	private String email;
	private String board;

	public ItrBean(String empName, String empPass, double amount, String tel, String email, Date board, List<AttendBean> attendBeans){
		this.empName = empName;
		this.empPass = empPass;
		this.amount = amount;
		this.tel = tel;
		this.email = email;
		this.board = new SimpleDateFormat("yyyy-mm-dd").format(board);
		this.attendBeans = attendBeans;
	}
}