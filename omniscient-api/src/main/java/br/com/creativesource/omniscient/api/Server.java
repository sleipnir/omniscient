package br.com.creativesource.omniscient.api;

import java.util.List;

public interface Server extends DiscoveryManagement {
	
	public boolean isRunning();
	public List<Node> getNodes();
	
	public void stop() throws Exception;
	public void start() throws Exception;
	
}
