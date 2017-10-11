package br.com.creativesource.spring.omniscient.discovery.configuration;

import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.creativesource.omniscient.server.tools.HazelcastServer;
import br.com.creativesource.spring.omniscient.discovery.api.OmniscientRestApiController;

@Configuration
@ComponentScan(basePackageClasses = { OmniscientRestApiController.class})
public class OmniscientDiscoveryServerConfig {

	private HazelcastServer hazelcastServer;

	@Bean
	public HazelcastServer hazelcastServer() throws Exception {
		hazelcastServer = new HazelcastServer();
		hazelcastServer.start();
		return hazelcastServer;
	}

	@PreDestroy
	public void destroy() throws Exception {
		hazelcastServer.stop();
	}

}
