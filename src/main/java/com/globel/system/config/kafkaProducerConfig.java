package com.globel.system.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class kafkaProducerConfig {

	@Bean
	public NewTopic createTopic() {
		return new NewTopic("javatechie-demo-3", 5, (short) 1);
	}
}
