package Class_13_Lemada_Expression;

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
		return "Employee [empName=" + empNmae + ", empId=" + empId + "]";
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
