package com.pengfei.intern.vo;

import com.pengfei.intern.domain.CheckBack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Setter
@Getter
public class AppBean implements Serializable
{
	private static final long serialVersionUID = 48L;

	private int id;
	private String emp;
	private int emp_id;
	private String date;
	private String unAttend;
	private String toAttend;
	private String reason;
	private boolean handled;
	private CheckBackBean checkBackBean;

	public AppBean(int id,String emp,int emp_id,String date
			,String unAttend,String toAttend,String reason){
		this.id = id;
		this.emp = emp;
		this.emp_id = emp_id;
		this.date = date;
		this.unAttend = unAttend;
		this.toAttend = toAttend;
		this.reason = reason;
	}

	public AppBean(String toAttend,boolean handled){
		this.toAttend = toAttend;
		this.handled = handled ;
	}

}