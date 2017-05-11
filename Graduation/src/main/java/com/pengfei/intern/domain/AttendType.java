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
	// ��ʶ����
	@Id @Column(name="type_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	// �������͵�����
	@Column(name="type_name", nullable=false , length=50,unique = true)
	private String name;
	// ������ڶ�Ӧ�ķ���
	@Column(name="amerce_amount", nullable=false)
	private double amerce;

	// ����name��amerce����дhashCode()����
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int)amerce;
		return result;
	}
	// ����name��amerce����дequals()����.
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