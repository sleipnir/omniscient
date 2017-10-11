package br.com.creativesource.omniscient.api;

import lombok.Getter;

public enum Protocol {
	HTTP("http"), 
	HTTPS("https"), 
	TCP("tcp"), 
	UDP("udp"), 
	FTP("ftp"), 
	FTPS("ftps"), 
	SFTP("sftp"),
	SCP("scp"),
	GIT("git"),
	MAIL("mail"),
	FILE("file");
	
	@Getter
	private final String protocol; 
	private static final String SCHEME_SUFFIX = "://";
	
	private Protocol(final String protocol) {
		this.protocol = protocol;
	}
	
	public String toScheme() {
		return this.protocol + SCHEME_SUFFIX;
	}
}
