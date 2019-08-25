package our.learn.java;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
	

}



/*
 * @Service //@Repository //@Component
 * 
 * public static List<Book> BOOKS = new ArrayList<>(10); public static
 * Map<Integer , Book> BOOKMAP = new HashMap<>(10);
 * 
 * static { BOOKS.add(new Book(1001 , "Harry Potter")); BOOKS.add(new Book(1002
 * , "The old man and sea")); BOOKS.add(new Book(1003 , "Essential Java"));
 * BOOKS.add(new Book(1004 , "Essential Spring 5")); BOOKS.add(new Book(1005 ,
 * "Essential Hibernate and JPA"));
 * 
 * for(Book book : BOOKS) { BOOKMAP.put(book.getId(), book); } }
 */