package org.davshaw.livechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LiveChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveChatApplication.class, args);
	}

}
