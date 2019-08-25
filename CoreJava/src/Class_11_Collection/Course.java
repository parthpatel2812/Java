package Class_11_Collection;

public class Course 
{	
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
