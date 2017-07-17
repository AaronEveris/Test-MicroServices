package test.swagger;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="onlinestore", description="prueba")
public class ServiceExample {

	private static Logger log = LoggerFactory.getLogger(ServiceExample.class);

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/hello")
	@ApiOperation(value="Operation", response=Greeting.class)
	public Greeting example(@RequestParam(value="name", defaultValue="World") String name) {
		 return new Greeting(counter.incrementAndGet(),
                 String.format(template, name));
	}

}
