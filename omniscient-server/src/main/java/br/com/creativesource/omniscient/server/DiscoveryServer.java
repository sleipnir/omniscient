package br.com.creativesource.omniscient.server;

import br.com.creativesource.omniscient.server.tools.HazelcastServer;
import lombok.Data;

public @Data class DiscoveryServer {
	
	private HazelcastServer server;

}
