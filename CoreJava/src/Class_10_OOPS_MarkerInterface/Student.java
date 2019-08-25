package Class_10_OOPS_MarkerInterface;

import java.io.Serializable;

public class Student implements Cloneable, Serializable {
	private int id;
	private Course course;
//	private transient String name;  // transient veriable can't serialize

	public Student(int id, Course course) {
		super();
		this.id = id;
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", course=" + course + "]";
	}

	
	
	
}
