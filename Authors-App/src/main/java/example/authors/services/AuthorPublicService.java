package example.authors.services;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import example.authors.vo.Author;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="onlinestore")
public class AuthorPublicService {

	private static Logger log = LoggerFactory.getLogger(AuthorPublicService.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/getAuthorByName")
	@ApiOperation(value="getAuthorByName", response=Author.class)
	public Author getAuthorByName(@RequestParam(value="name", required=true) String name) {
		log.info("Method public: getAuthorByName");
		String uri = "http://compzuul:8765/private/getAuthorByName";
		Author author = restTemplate.getForObject(uri,Author.class, name);
		return author;
	}

	@RequestMapping(value = "/getAllAuthors")
	@ApiOperation(value="getAllAuthors", response=List.class)
	public List<Author> getAllAuthors(){
		log.info("Method public: getAllAuthors");
		String uri = "http://compzuul:8765/private/getAllAuthors";
		List<Author> allAuthors = restTemplate.getForObject(uri,List.class);
		return allAuthors;
	}

}
