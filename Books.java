package poc.rest.ws.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOKS")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bookId;
	private String title;
	private List<String> authors;
	private int edition;
	private String description;
	private List<Content> contents;
	private Publisher publisher;
	
	public Book(){}
	
	public Book(Long bookId, String title, List<String> authors, int edition, String description,
			List<Content> contents, Publisher publisher ){
		this.bookId = bookId;
		this.title = title;
		this.authors = authors;
		
	}
	
	
}
