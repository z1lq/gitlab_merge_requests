package com.github.z1lq.gitlab_merge_requests;

import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	public Map<String, Object> simpleRequest(OAuth2AuthenticationToken oAuth2AuthenticationToken) {
		return oAuth2AuthenticationToken.getPrincipal().getAttributes();
	}

}
