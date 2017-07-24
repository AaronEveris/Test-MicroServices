package example.authors.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan
public class ApplicationRestService {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRestService.class, args);
	}
	
}
