package br.com.creativesource.omniscient.server.tools;

import java.util.List;
import java.util.Objects;

import com.hazelcast.core.HazelcastInstance;

import br.com.creativesource.omniscient.api.Node;
import br.com.creativesource.omniscient.api.Query;
import br.com.creativesource.omniscient.api.Server;
import br.com.creativesource.omniscient.api.Service;
import br.com.creativesource.omniscient.core.HazelcastUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HazelcastServer implements Server {
	private static final long serialVersionUID = 1L;
	
	private boolean running = false;
	private static HazelcastInstance nodeInstance;

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
	public boolean isRunning() {
		return this.running;
	}

	@Override
	public List<Node> getNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void stop() throws Exception {
		if(this.running) {
			log.debug("Stopping Node Server instance {} ...", nodeInstance.getName());
			nodeInstance.shutdown();
			this.running = false;
			log.debug("Node Server instance {} stopped", nodeInstance.getName());
		}
	}

	@Override
	public void start() throws Exception {
		// TODO Add business logic here
		if(Objects.isNull(nodeInstance)) {
			nodeInstance = HazelcastUtils.nodeInstance();
		}
		log.debug("Node Server started. Instance Name {}", nodeInstance.getName());
		this.running = true;
	}

}
