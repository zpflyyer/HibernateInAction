package com.pengfei.intern.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	private String payMonth;
	private double amount;

}