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
@Table(name="application_inf")
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Application
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	// 代表标识属性
	@Id	@Column(name="app_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	// 申请理由
	@Column(name="app_reason" , length=50)
	private String reason;
	// 是否处理
	@Column(name="app_result")
	private boolean result;
	// 关联的出勤记录
	@ManyToOne(targetEntity=Attend.class)
	@JoinColumn(name="attend_id" , nullable=false)
	private Attend attend;
	// 希望将指定出勤改为的type类型
	@ManyToOne(targetEntity=AttendType.class)
	@JoinColumn(name="type_id", nullable=false)
	private AttendType type;
	// 申请的结果
	@OneToOne(targetEntity=CheckBack.class, mappedBy="app")
	private CheckBack check;
	// 反馈前端Ajax请求
	@Transient
	private String response;


}