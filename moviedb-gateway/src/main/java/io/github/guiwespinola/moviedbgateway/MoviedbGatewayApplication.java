package io.github.guiwespinola.moviedbgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class MoviedbGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviedbGatewayApplication.class, args);
	}

}
