package com.pengfei.intern.vo;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	private String empName;
	private String empPass;
	private double amount;
}