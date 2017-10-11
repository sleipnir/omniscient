package br.com.creativesource.omniscient.core;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public final class HazelcastUtils {
	
	public static HazelcastInstance nodeInstance() {
		return Hazelcast.newHazelcastInstance();
		
	}
	
	public static HazelcastInstance nodeInstance(Config config) {
		return Hazelcast.newHazelcastInstance(config);
		
	}
	
	public static HazelcastInstance clientInstance() {
		return HazelcastClient.newHazelcastClient();
		
	}
	
	public static HazelcastInstance clientInstance(ClientConfig config) {
		return HazelcastClient.newHazelcastClient(config);
	}

}
