package com.pengfei.intern.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AppBean implements Serializable
{
	private static final long serialVersionUID = 48L;

	private int id;
	private String emp;
	private String date;
	private String unAttend;
	private String toAttend;
	private String reason;

}