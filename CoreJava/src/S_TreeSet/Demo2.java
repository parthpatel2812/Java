package S_TreeSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo2{
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		
		Student s1 = new Student("PATEL", "PARTH" , 3);
		Student s2 = new Student("PATEL", "ATIT" , 1);
		Student s3 = new Student("RAJ", "PARTH" , 4);
		Student s4 = new Student("SHAH", "ATIT" , 2);
		
System.out.println("Enter \n 1 for sort by FirstName \n 2 for sort by LastName \n 3 for sort by id");
		
		int c = s.nextInt();
		
		switch(c)
		{
			case 1:
			{
				Set<Student> set = new TreeSet(new FirstName());
				set.add(s1);
				set.add(s2);
				set.add(s3);
				set.add(s4);
				
				for(Student s11: set)
				{
					System.out.println(s11);
				}
			}
			break;
			case 2:
			{
				Set<Student> set = new TreeSet(new LastName());
				set.add(s1);
				set.add(s2);
				set.add(s3);
				set.add(s4);
				
				for(Student s11: set)
				{
					System.out.println(s11);
				}
			}
			break;
			case 3:
			{
				Set<Student> set = new TreeSet(new Id());
				set.add(s1);
				set.add(s2);
				set.add(s3);
				set.add(s4);
				
				for(Student s11: set)
				{
					System.out.println(s11);
				}
			}
			
			}
		}
	}
	



class Student 
{
	private String firstname;
	private String lastname;
	private Integer id;
	
	public Student(String firstname, String lastname, Integer id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
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
		Student other = (Student) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + "]";
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}

class FirstName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return (o1).getFirstname().compareTo((o2).getFirstname());
	}
	
}

class LastName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return (o1).getLastname().compareTo((o2).getLastname());
	}
	
}

class Id implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return (o1).getId().compareTo((o2).getId());
	}
	
}