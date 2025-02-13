package com.backend.proposta_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@EnableScheduling
@SpringBootApplication
@EnableWebSocketMessageBroker
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
