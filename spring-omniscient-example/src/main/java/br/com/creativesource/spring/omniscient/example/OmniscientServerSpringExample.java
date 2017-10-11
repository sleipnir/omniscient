package br.com.creativesource.spring.omniscient.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.creativesource.spring.omniscient.discovery.EnableOmniscientDiscoveryServer;

@SpringBootApplication
@EnableOmniscientDiscoveryServer
public class OmniscientServerSpringExample {

	public static void main(String[] args) {
		SpringApplication.run(OmniscientServerSpringExample.class, args);
	}

}
