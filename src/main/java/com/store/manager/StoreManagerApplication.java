package com.store.manager;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreManagerApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();

		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		System.setProperty("DDL_AUTO", dotenv.get("DDL_AUTO"));
		System.setProperty("SHOW_SQL", dotenv.get("SHOW_SQL"));
		System.setProperty("DIALECT", dotenv.get("DIALECT"));
		System.setProperty("FORMAT_SQL", dotenv.get("FORMAT_SQL"));
		System.setProperty("PROFILE_DEV", dotenv.get("PROFILE_DEV"));
		System.setProperty("PROFILE_TEST", dotenv.get("PROFILE_TEST"));
		System.setProperty("PROFILE_PROD", dotenv.get("PROFILE_PROD"));
		System.setProperty("LOCAL_URL", dotenv.get("LOCAL_URL"));
		System.setProperty("DEPLOY_URL", dotenv.get("DEPLOY_URL"));

		SpringApplication.run(StoreManagerApplication.class, args);
	}

}
