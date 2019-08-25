package Class_15_hashcode_equal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application1 {
	public static void main(String[] args) {

		/*
		 * //List<Integer> list = new ArrayList<>(); // List<Integer> list = new
		 * LinkedList<>();
		 * 
		 * 
		 * list.add(10); list.add(1); list.add(15); list.add(8); list.add(10);
		 * 
		 * list.forEach(System.out::println);
		 */

		/*
		 * //Set<Integer> set = new HashSet<>(); Set<Integer> set = new
		 * TreeSet<>();
		 * 
		 * set.add(10); set.add(1); set.add(15); set.add(8); set.add(10);
		 * set.forEach(System.out::println);
		 */

		/*
		 * Map<Integer,String> map = new HashMap<>(7); map.put(10, "Parth");
		 * map.put(7, "Jhon"); map.put(10, "Mark"); map.put(14, "Parth");
		 * map.put(2, "David");
		 * 
		 * 
		 * map.entrySet().forEach(x -> System.out.println(x.getKey() +" "
		 * +x.getValue()));
		 */

		List<Employee> employee = Arrays.asList(new Employee(15, "John"), new Employee(7, "Luke"),
				new Employee(15, "Tom"), new Employee(15, "Parth"), new Employee(15, "Jsdkl"), new Employee(15, "Parth")

		);

		// employee.forEach(System.out::println);

		Set<Employee> empSet = new HashSet<>(employee);
		empSet.forEach(System.out::println);

	}
}
