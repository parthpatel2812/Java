package Class_10_OOPS_MarkerInterface;

import java.io.Serializable;

public class Course implements Cloneable, Serializable {
	private int id;

	public Course(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + "]";
	}

}
