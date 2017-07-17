package test.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceExample {

	@Value("{rest.service.cloud.config.example}")
	String valueExample = null;

	private static Logger log = LoggerFactory.getLogger(ServiceExample.class);

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/greeting")
	public Greeting example(@RequestParam(value="name", defaultValue="World") String name) {
		 return new Greeting(counter.incrementAndGet(),
                 String.format(template, name));
	}

}
