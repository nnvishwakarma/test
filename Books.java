package poc.rest.ws.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BOOKS")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bookId;
	private String title;
	@OneToMany	
	private List<Author> authors;
	private int edition;
	private String description;
	@OneToMany	
	private List<Content> contents;
	@ManyToOne
	private Publisher publisher;
	private String preface;
	
	public Book(){}
	
	public Book(Long bookId, String title, List<Author> authors, int edition, String description,
			List<Content> contents, Publisher publisher,String preface){
		this.bookId = bookId;
		this.title = title;
		this.authors = authors;
		this.edition = edition;
		this.description = description;
		this.contents = contents;
		this.publisher = publisher;		
		this.preface = preface;
	}
	
	public String toString(){
		return String.format("Book: [%d, %s, %s, %d, %s, %s ]",
				getBookId(), getTitle(), getAuthors(), getEdition(), getDescription(), getPublisher().toString()
				); 
	}
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Content> getContents() {
		return contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public String getPreface() {
		return preface;
	}

	public void setPreface(String preface) {
		this.preface = preface;
	}	
	
}
