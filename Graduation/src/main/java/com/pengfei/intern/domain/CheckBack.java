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
	// ��ʶ����
	@Id @Column(name="check_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	// �Ƿ�ͬ������
	@Column(name="check_result", nullable=false)
	private boolean result;
	// ��������
	@Column(name="check_reason" , length=255)
	private String reason;
	// ��������Ӧ������
	@OneToOne(targetEntity=Application.class)
	@JoinColumn(name="app_id", nullable=false , unique=true)
	private Application app;
	// �����ľ���
	@ManyToOne(targetEntity=Manager.class)
	@JoinColumn(name="mgr_id" , nullable=false)
	private Manager manager;
	// ����ǰ��Ajax����
	@Transient
	private String response;

}