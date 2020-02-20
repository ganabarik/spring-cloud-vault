package com.gnb.gmart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GmartCredential.class)
public class GmartCloudVaultApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(GmartCloudVaultApplication.class);
	
	private GmartCredential credential;
	
	public GmartCloudVaultApplication(GmartCredential credential) {
		super();
		this.credential = credential;
	}

	public static void main(String[] args) {
		SpringApplication.run(GmartCloudVaultApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		logger.info("username :"+credential.getUsername());
		logger.info("password :"+credential.getPassword());
	}

}
