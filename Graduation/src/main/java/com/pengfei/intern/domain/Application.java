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
	// �����ʶ����
	@Id	@Column(name="app_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	// ��������
	@Column(name="app_reason" , length=50)
	private String reason;
	// �Ƿ���
	@Column(name="app_result")
	private boolean result;
	// �����ĳ��ڼ�¼
	@ManyToOne(targetEntity=Attend.class)
	@JoinColumn(name="attend_id" , nullable=false)
	private Attend attend;
	// ϣ����ָ�����ڸ�Ϊ��type����
	@ManyToOne(targetEntity=AttendType.class)
	@JoinColumn(name="type_id", nullable=false)
	private AttendType type;
	// ����Ľ��
	@OneToOne(targetEntity=CheckBack.class, mappedBy="app")
	private CheckBack check;
	// ����ǰ��Ajax����
	@Transient
	private String response;


}