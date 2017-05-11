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
@Table(name="checkback_tb")
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class CheckBack
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	// 标识属性
	@Id @Column(name="check_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	// 是否同意申请
	@Column(name="check_result", nullable=false)
	private boolean result;
	// 批复理由
	@Column(name="check_reason" , length=255)
	private String reason;
	// 该批复对应的申请
	@OneToOne(targetEntity=Application.class)
	@JoinColumn(name="app_id", nullable=false , unique=true)
	private Application app;
	// 批复的经理
	@ManyToOne(targetEntity=Manager.class)
	@JoinColumn(name="mgr_id" , nullable=false)
	private Manager manager;
	// 反馈前端Ajax请求
	@Transient
	private String response;

}