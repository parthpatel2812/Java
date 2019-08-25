package org.learn.hibernate.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STORE")
//@NamedNativeQuery(name="selectAll", query = "CALL select_all_store()", resultClass = Store.class)
@NamedStoredProcedureQuery(name = "selectAll" , procedureName = "select_all_store", resultClasses = {Store.class})
public class Store implements Serializable {

	private static final long serialVersionUID = -2659815656806581813L;

	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NMAE")
	private String name;

	@Column(name = "LOCATION")
	private String location;

	@OneToMany( mappedBy = "store", cascade = CascadeType.ALL, orphanRemoval=true)
	
	private List<Employee> employee;

	public Store() {

	}

	public Store(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", location=" + location + ", employee=" + employee + "]";
	}

	
}
