package example.library.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.library.vo.Author;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="onlinestore")
public class AuthorService {

	private static Logger log = LoggerFactory.getLogger(AuthorService.class);
	
	@RequestMapping(value = "/getAuthorByName")
	@ApiOperation(value="getAuthorByName", response=Author.class)
	public Author getAuthorByName(@RequestParam(value="name", required=true) String name) {
		log.info("Method: getAuthorByName");
		Author author = new Author("Gabriel", "Garcia Marquez", "Colombian");
		return author;
	}

	@RequestMapping(value = "/getAllAuthors")
	@ApiOperation(value="getAllAuthors", response=List.class)
	public List<Author> getAllAuthors(){
		log.info("Method: getAllAuthors");
		Author author1 = new Author("Gabriel", "Garcia Marquez", "Colombian");
		Author author2 = new Author("Miguel", "De Cervantes", "Spanish");
		List<Author> allAuthors = new ArrayList<Author>();
		allAuthors.add(author1);
		allAuthors.add(author2);
		return allAuthors;
	}
}
