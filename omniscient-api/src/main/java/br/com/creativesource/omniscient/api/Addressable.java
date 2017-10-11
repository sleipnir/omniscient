package br.com.creativesource.omniscient.api;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;

public interface Addressable extends Serializable {
	
	public String toURL() throws URISyntaxException;
	public URI toURI() throws URISyntaxException;

}
