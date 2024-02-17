package org.davshaw.livechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LiveChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveChatApplication.class, args);
    System.out.println("From now on, if you see anything below this message, that means its a Api Request");
	}

}
