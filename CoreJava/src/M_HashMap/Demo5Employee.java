package M_HashMap;

public class Demo5Employee 
{
	private int id;
	private String fn;
	private String ln;
	public Demo5Employee(int id, String fn, String ln) {
		super();
		this.id = id;
		this.fn = fn;
		this.ln = ln;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	@Override
	public String toString() {
		return "Demo5Employee [id=" + id + ", fn=" + fn + ", ln=" + ln + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fn == null) ? 0 : fn.hashCode());
		result = prime * result + id;
		result = prime * result + ((ln == null) ? 0 : ln.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo5Employee other = (Demo5Employee) obj;
		if (fn == null) {
			if (other.fn != null)
				return false;
		} else if (!fn.equals(other.fn))
			return false;
		if (id != other.id)
			return false;
		if (ln == null) {
			if (other.ln != null)
				return false;
		} else if (!ln.equals(other.ln))
			return false;
		return true;
	}
	
	

}
