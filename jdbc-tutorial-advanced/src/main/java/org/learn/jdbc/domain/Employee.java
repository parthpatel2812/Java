package org.learn.jdbc.domain;

public class Employee {

	private Integer id;
	private String nmae;

	public Employee(Integer id, String nmae) {
		super();
		this.id = id;
		this.nmae = nmae;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNmae() {
		return nmae;
	}

	public void setNmae(String nmae) {
		this.nmae = nmae;
	}

}
