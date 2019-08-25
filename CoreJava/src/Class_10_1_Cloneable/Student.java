package Class_10_1_Cloneable;

public class Student implements Cloneable
{
	private int id;
	private String name;
	private Course courseName;
	
	public Student(int id, String name, Course courseName) {
		super();
		this.id = id;
		this.name = name;
		this.courseName = courseName;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Course getCourseName() {
		return courseName;
	}


	public void setCourseName(Course courseName) {
		this.courseName = courseName;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + "]";
	}


}
