package S_TreeSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo1_1_compareTo_compare  
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
	
		
		Book b1 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book b2 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book b3 = new Book("Walden", "Henry David Thoreau", 1854);
		Book b4 = new Book("Effective Java", "Joshua Bloch", 2008);
		
		System.out.println("Enter \n 1 for use cpmpareTo() method \n 2 for use compare() method");
		
		int c = s.nextInt();
		
		switch(c)
		{
			case 1:
			{
				Set<Book> treeset = new TreeSet<>();
				treeset.add(b1);
				treeset.add(b2);
				treeset.add(b3);
				treeset.add(b4);
				
				for(Book b : treeset)
				{
					System.out.println(b);
				}
			}
			break;
			case 2:
			{
				Set<Book> treeset = new TreeSet<>(new TitleComparator());
				treeset.add(b1);
				treeset.add(b2);
				treeset.add(b3);
				treeset.add(b4);
				
				for(Book b : treeset)
				{
					System.out.println(b);
				}
			}
		}
		
		

	}
}

// Implement comparable
class Book implements Comparable 
{
	
	private String titel;
	private String author;
	private int year;
	
	public Book(String titel, String author, int year) {
		super();
		this.titel = titel;
		this.author = author;
		this.year = year;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((titel == null) ? 0 : titel.hashCode());
		result = prime * result + year;
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (titel == null) {
			if (other.titel != null)
				return false;
		} else if (!titel.equals(other.titel))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Book [titel=" + titel + ", author=" + author + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Object book) {
		return getTitel().compareTo(((Book)book).getTitel()); //utilizing String compareTo
	}	
	
	
	
	
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}


class TitleComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		
		return ((Book)o1).getTitel().compareTo(((Book)o2).getTitel());
	}
	
}