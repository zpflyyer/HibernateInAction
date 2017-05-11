package com.pengfei.intern.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="attend_type_tb")
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class AttendType
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	// 标识属性
	@Id @Column(name="type_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	// 出勤类型的名称
	@Column(name="type_name", nullable=false , length=50,unique = true)
	private String name;
	// 此类出勤对应的罚款
	@Column(name="amerce_amount", nullable=false)
	private double amerce;

	// 根据name、amerce来重写hashCode()方法
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int)amerce;
		return result;
	}
	// 根据name、amerce来重写equals()方法.
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		AttendType other = (AttendType) obj;
		if (name == null)
		{
			if (other.name != null) return false;
		}
		else if (!name.equals(other.name)) return false;
		if (amerce != other.amerce) return false;
		return true;
	}
}