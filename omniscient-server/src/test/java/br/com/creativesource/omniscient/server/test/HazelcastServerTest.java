package br.com.creativesource.omniscient.server.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.creativesource.omniscient.server.tools.HazelcastServer;

public class HazelcastServerTest {
	
	private HazelcastServer server;
	
	@Before
	public void setup() {
		server = new HazelcastServer(); 
	}
	
	@Test
	public void hazelcastServerStartTest() throws Exception {
		server.start();
		assertTrue(server.isRunning());
	}
	
	@After
	public void release() throws Exception {
		assertTrue(server.isRunning());
		server.stop();
		assertFalse(server.isRunning());
	}

}
