package com.keshri.demo.SampleDemo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		init();
	}

	private void init() {
		register(StudentEndpoint.class);
	}
}
