package com.gnb.gmart;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties("gmart")
public class GmartCredential {

	private String username;
	private String password;
}
