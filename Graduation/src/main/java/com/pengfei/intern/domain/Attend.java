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

	// 代表标识属性
	@Id @Column(name="attend_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	// 出勤日期
	@Column(name="duty_day", nullable=false, length=50)
	private String dutyDay;
	// 打卡时间
	@Column(name="punch_time")
	private Date punchTime;
	// 代表本次打卡是否为上班打卡
	@Column(name="is_come" , nullable=false)
	private boolean isCome;
	// 本次出勤的类型
	@ManyToOne(targetEntity=AttendType.class)
	@JoinColumn(name="type_id", nullable=false)
	private AttendType type;
	// 本次出勤关联的员工
	@ManyToOne(targetEntity=Intern.class)
	@JoinColumn(name="emp_id", nullable=false)
	private Intern employee;

	// 根据employee、isCome、dutyDay来重写hashCode()方法
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
	// 根据employee、isCome、dutyDay来重写equals()方法
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