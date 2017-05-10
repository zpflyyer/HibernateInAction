package com.pengfei.intern.domain;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="attend_inf")
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Attend
	implements Serializable
{
	private static final long serialVersionUID = 48L;

	// �����ʶ����
	@Id @Column(name="attend_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	// ��������
	@Column(name="duty_day", nullable=false, length=50)
	private String dutyDay;
	// ��ʱ��
	@Column(name="punch_time")
	private Date punchTime;
	// �����δ��Ƿ�Ϊ�ϰ��
	@Column(name="is_come" , nullable=false)
	private boolean isCome;
	// ���γ��ڵ�����
	@ManyToOne(targetEntity=AttendType.class)
	@JoinColumn(name="type_id", nullable=false)
	private AttendType type;
	// ���γ��ڹ�����Ա��
	@ManyToOne(targetEntity=Intern.class)
	@JoinColumn(name="emp_id", nullable=false)
	private Intern employee;

	// ����employee��isCome��dutyDay����дhashCode()����
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
			+ ((dutyDay == null) ? 0 : dutyDay.hashCode());
		result = prime * result
			+ ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + (isCome ? 1231 : 1237);
		return result;
	}
	// ����employee��isCome��dutyDay����дequals()����
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Attend other = (Attend) obj;
		if (dutyDay == null)
		{
			if (other.dutyDay != null) return false;
		}
		else if (!dutyDay.equals(other.dutyDay)) return false;
		if (employee == null)
		{
			if (other.employee != null) return false;
		}
		else if (!employee.equals(other.employee)) return false;
		if (isCome != other.isCome) return false;
		return true;
	}
}