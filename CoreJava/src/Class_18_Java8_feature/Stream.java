package Class_18_Java8_feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(
				new Employee(15, "Aphn"),
				new Employee(7, "Luke"), 
				new Employee(12, "Xyhn"),
				new Employee(17, "John"), 
				new Employee(17, "John"));

		// emp.stream().forEach(System.out::println);

		// emp.stream().filter(x->x.getId()>12).forEach(System.out::println);

		List<Employee> processedList = emp.
		stream().							// you can use parallelStream more big data
		filter(x -> x.getId() > 10).
		sorted((o1, o2) -> o1.getId().
		compareTo(o2.getId())).
		collect(Collectors.toList());
		//.forEach(System.out::println);
		
		for(Employee e : processedList)
			System.out.println(e);
		
	}
}

class Employee {
	private Integer id;
	private String name;

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}