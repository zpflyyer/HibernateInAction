package org.crazyit.app.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name="person_inf")
public class Person
{
	@Id @Column(name="perosn_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private int age;

	@ElementCollection(targetClass=String.class)
	@CollectionTable(name="school_inf", // ָ������Ϊschool_inf
		joinColumns=@JoinColumn(name="person_id" , nullable=false))
	@Column(name="school_name")
	@OrderColumn(name="list_order")
	private List<String> schools
		= new ArrayList<String>();

	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "access_inf", joinColumns = @JoinColumn(name = "person_id", nullable = false))
	@Column(name = "detail")
	@MapKeyColumn(name = "approach",nullable = false)
	@MapKeyClass(String.class)
	private Map<String,String> addresses = new HashMap<String, String>();

	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "joy_inf", joinColumns = @JoinColumn(name = "person_id", nullable = false))
	@Column(name = "joy", nullable = false)
	private Set<String> joys = new HashSet<String>();

	private Relativity relativity;

	@ElementCollection(targetClass = Price.class)
	@CollectionTable(name = "fru_pri",joinColumns = @JoinColumn(name = "owner_id",nullable = false))
	@MapKeyClass(Fruit.class)
	private Map<Fruit,Price> fruitsMap = new HashMap<Fruit, Price>();

//	@ElementCollection(targetClass = Relativity.class)
//	@CollectionTable(name = "relas",joinColumns = @JoinColumn(name = "owner_id",nullable = false))
//	@OrderColumn(name = "relas_ord")
//	private List<Relativity> relativityList;

}