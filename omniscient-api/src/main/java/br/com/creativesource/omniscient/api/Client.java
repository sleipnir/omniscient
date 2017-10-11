package br.com.creativesource.omniscient.api;

public interface Client extends DiscoveryManagement {
	
	public void connect() throws Exception;
	public void stop() throws Exception;
	public void start() throws Exception;
	public boolean isActiveMode();

}
