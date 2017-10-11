package br.com.creativesource.spring.omniscient.discovery;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import br.com.creativesource.spring.omniscient.discovery.configuration.OmniscientDiscoveryServerConfig;

@Target(TYPE)
@Retention(RUNTIME)
@Import(OmniscientDiscoveryServerConfig.class)
public @interface EnableOmniscientDiscoveryServer {}
