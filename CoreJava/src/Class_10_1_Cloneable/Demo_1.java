package Class_10_1_Cloneable;

public class Demo_1 
{
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Parth" , new Course("Java"));
		
		System.out.println(s1);
		
		
		
		try {
			Student s2 = (Student) s1.clone();
			
			/*System.out.println(s2);
			s1.setId(102);
			s1.setName("Patel");
			s1.getCourseName().setCourseNamne("Advance Java");
			System.out.println(s1); 
			System.out.println(s2); // If i do any cheang in original Object it reflect on copied Object to.
		*/
			System.out.println(s2);
			s2.setId(102);
			s2.setName("Patel");
			s2.getCourseName().setCourseNamne("Advance Java");
			System.out.println(s1);
			System.out.println(s2);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
	}

}
