package Class_11_1_Comparable_compareTo;

public class Department implements Comparable<Department>
{
	private String dName;
	private Integer dId;
	private Integer phone;
	
	public Department(String dName, Integer dId, Integer phone) {
		super();
		this.dName = dName;
		this.dId = dId;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Department [dName=" + dName + ", dId=" + dId + ", phone=" + phone + "]";
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Override
	public int compareTo(Department o) {
				
		return this.dName.compareTo(o.getdName());
	}
	
	
	
	
	
	
	
	
	/*private String dName;

	
	public Department(String dName) {
		//super();
		this.dName = dName;

	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	

	@Override
	public String toString() {
		return "Department [dName=" + dName + "]";
	}

	@Override
	public int compareTo(Department o) {
		
		return this.dName.compareTo(o.getdName());
	}
  */
}
