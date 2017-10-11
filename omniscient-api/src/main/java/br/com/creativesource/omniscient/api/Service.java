package br.com.creativesource.omniscient.api;

import java.net.URI;
import java.net.URISyntaxException;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Builder
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public final @Data class Service implements Addressable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String group;
	private String address;
	private Protocol protocol;

	@Override
	public URI toURI() throws URISyntaxException {
		return new URI(buildURL());
	}

	@Override
	public String toURL() throws URISyntaxException {
		return buildURL();
	}
	
	private String buildURL() {
		return this.protocol.toScheme() + this.address;
	}

}
