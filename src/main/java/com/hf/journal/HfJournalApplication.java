package com.hf.journal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HfJournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HfJournalApplication.class, args);
	}

}
