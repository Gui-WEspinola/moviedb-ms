package io.github.guiwespinola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
@SpringBootApplication
public class JsonParserApplication {
    public static void main(String[] args) {
        SpringApplication.run(JsonParserApplication.class, args);
    }
}
