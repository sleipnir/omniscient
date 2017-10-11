package br.com.creativesource.omniscient.api.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Before;
import org.junit.Test;

import br.com.creativesource.omniscient.api.Protocol;
import br.com.creativesource.omniscient.api.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddressableTest {
	
	private Service service;
	
	@Before
	public void setup() {
		service = Service.builder()
				.name("test-service")
				.group("test-group")
				.address("127.0.0.1")
				.protocol(Protocol.HTTP)
				.build();
	}
	
	@Test
	public void uriSchemeTest() throws URISyntaxException {
		
		URI uri = service.toURI();
		
		log.info("URI -> {}", uri);
		
		assertNotNull(uri);
		assertEquals(new URI("http://127.0.0.1"), uri);
	}
	
	@Test
	public void urlSchemeTest() throws URISyntaxException {
		
		String url = service.toURL();
		
		log.info("URL -> {}", url);
		
		assertNotNull(url);
		assertEquals("http://127.0.0.1", url);
	}

}
