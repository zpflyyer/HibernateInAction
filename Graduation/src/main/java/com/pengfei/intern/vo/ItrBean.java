package com.pengfei.intern.vo;

import lombok.*;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ItrBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	private int id;
	private String empName;
	private String empPass;
	private double amount;
	private String mgr;
	private String dept;
	private List<AttendBean> attendBeans;
	private String tel;
	private String email;
	private String board;
	private String real_name;
	private String id_number;

	public ItrBean(int id,String empName, String empPass, double amount, String tel, String email, Date board,String real_name,String id_number, List<AttendBean> attendBeans){
		this.id = id;
		this.empName = empName;
		this.empPass = empPass;
		this.amount = amount;
		this.tel = tel;
		this.email = email;
		this.id_number = id_number;
		this.real_name = real_name;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(board);
		calendar.add(Calendar.MONTH,1);
		this.board = new SimpleDateFormat("yyyy-mm-dd").format(calendar.getTime());
		this.attendBeans = attendBeans;
	}
}