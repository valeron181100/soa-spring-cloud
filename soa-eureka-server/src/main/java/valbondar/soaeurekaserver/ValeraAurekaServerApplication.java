package valbondar.soaeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ValeraAurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValeraAurekaServerApplication.class, args);
	}

}
