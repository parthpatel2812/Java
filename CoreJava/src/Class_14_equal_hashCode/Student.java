package Class_14_equal_hashCode;

public class Student {

	private String name;
	private Integer id;

	public Student(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * private String Name;
	 * 
	 * public Student(String name) { super(); Name = name;
	 * 
	 * }
	 * 
	 * @Override public String toString() { return "Student [Name=" + Name +
	 * "]"; }
	 * 
	 * public String getName() { return Name; }
	 * 
	 * public void setName(String name) { Name = name; }
	 * 
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((Name == null) ? 0 : Name.hashCode()); return
	 * result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return
	 * true; if (obj == null) return false; if (getClass() != obj.getClass())
	 * return false; Student other = (Student) obj; if (Name == null) { if
	 * (other.Name != null) return false; } else if (!Name.equals(other.Name))
	 * return false; return true; }
	 */

}
