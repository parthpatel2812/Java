package Class_10_OOPS_MarkerInterface;

public class Demo_1 {
	public static void main(String[] args) {

		Student s1 = new Student(1000, new Course(2000));
		System.out.println("Original Object");
		System.out.println(s1);

		try {
			Student s1Clone = (Student) s1.clone();
			System.out.println("Clonned Object");
			System.out.println(s1Clone);

			/*
			 * s1.setId(5555); 
			 * System.out.println("After Modificaton: ");
			 * System.out.println("Original Object"); System.out.println(s1);
			 * System.out.println("Clonned Object");
			 * System.out.println(s1Clone);
			 */
			s1.getCourse().setId(6666);
			System.out.println("After Modificaton: ");
			System.out.println("Original Object");
			System.out.println(s1);
			System.out.println("Clonned Object");
			System.out.println(s1Clone);

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}

	}

}
