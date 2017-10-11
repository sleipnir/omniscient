package br.com.creativesource.spring.omniscient.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.creativesource.spring.omniscient.discovery.EnableOmniscientDiscoveryClient;

@SpringBootApplication
@EnableOmniscientDiscoveryClient
public class OmniscientClientSpringExample {

	public static void main(String[] args) {
		SpringApplication.run(OmniscientClientSpringExample.class, args);
	}

}
