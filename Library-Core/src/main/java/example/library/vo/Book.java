package example.library.vo;

import java.io.Serializable;

public class Book implements Serializable {

	private String title;
	
	private String isbn;
	
	private Author author;

	public Book(String title, String isbn, Author author) {
		this.setTitle(title);
		this.setIsbn(isbn);
		this.setAuthor(author);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
