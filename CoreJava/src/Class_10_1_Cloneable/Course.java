package Class_10_1_Cloneable;

public class Course implements Cloneable
{
	private String courseNamne;

	public Course(String courseNamne) {
		super();
		this.courseNamne = courseNamne;
	}
	
	public String getCourseNamne() {
		return courseNamne;
	}

	public void setCourseNamne(String courseNamne) {
		this.courseNamne = courseNamne;
	}

	@Override
	public String toString() {
		return "Course [courseNamne=" + courseNamne + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	
	

}
