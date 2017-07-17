package test.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEurekaServer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationEurekaServer.class, args);
	}

}
