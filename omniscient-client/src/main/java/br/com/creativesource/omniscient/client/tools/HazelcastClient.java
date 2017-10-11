package br.com.creativesource.omniscient.client.tools;

import java.util.List;

import br.com.creativesource.omniscient.api.Client;
import br.com.creativesource.omniscient.api.Query;
import br.com.creativesource.omniscient.api.Service;

public class HazelcastClient implements Client {
	private static final long serialVersionUID = 1L;

	@Override
	public List<Service> getServices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Service> getServices(Query query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register(Service service) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregister(Service service) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void connect() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isActiveMode() {
		// TODO Auto-generated method stub
		return false;
	}

}
