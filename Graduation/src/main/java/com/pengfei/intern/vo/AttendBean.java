package com.pengfei.intern.vo;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Setter
@Getter
public class AttendBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	private int id;
	private String dutyDay;
	private String type;
	private Date time;
	private AppBean appBean;

	public AttendBean(int id, String dutyDay, String type, Date time){
		this.id = id;
		this.dutyDay = dutyDay;
		this.type = type;
		this.time = time;
	}

}