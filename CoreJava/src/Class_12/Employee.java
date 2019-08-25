package Class_12;

public class Employee 
{

	private Integer empId;
	private String empNmae;
	
	public Employee(Integer empId, String empNmae) {
		super();
		this.empId = empId;
		this.empNmae = empNmae;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNmae=" + empNmae + "]";
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpNmae() {
		return empNmae;
	}

	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
	}
	
	

}
