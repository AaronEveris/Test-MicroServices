package example.library.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.library.vo.Author;
import example.library.vo.Book;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="onlinestore")
public class BookService {

	private static Logger log = LoggerFactory.getLogger(BookService.class);
	
	@RequestMapping(value = "/getBookByIsbn")
	@ApiOperation(value="getBookByIsbn", response=Author.class)
	public Book getBookByIsbn(String isbn) {
		log.info("Method: getBookByIsbn");
		Author author = new Author("Gabriel", "Garcia Marquez", "Colombian");
		Book book = new Book("Cronicas de una muerte anunciada", "12341341234AFASF", author);
		return book;
	}
	
	@RequestMapping(value = "/getAllBooks")
	@ApiOperation(value="getAllBooks", response=Author.class)
	public List<Book> getAllBooks(){
		log.info("Method: getAllBooks");
		Author author1 = new Author("Gabriel", "Garcia Marquez", "Colombian");
		Author author2 = new Author("Miguel", "De Cervantes", "Spanish");
		Book book1 = new Book("Cronicas de una muerte anunciada", "12341341234AFASF", author1);
		Book book2 = new Book("Don Quijote de la Mancha", "12341341234AFASF", author2);
		List<Book> allBooks = new ArrayList<Book>();
		allBooks.add(book1);
		allBooks.add(book2);
		return allBooks;
	}
}
