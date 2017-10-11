package br.com.creativesource.omniscient.api;

import java.io.Serializable;
import java.util.List;

public interface DiscoveryManagement extends Serializable {
	
	public List<Service> getServices();
	public List<Service> getServices(Query query);
	
	public void register(Service service) throws Exception;
	public void unregister(Service service) throws Exception;

}
