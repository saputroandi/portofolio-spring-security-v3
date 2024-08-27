package com.portofolio.springkeycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SpringBootApplication
@SecurityScheme(name = "keycloak", openIdConnectUrl = "http://localhost:9090/realms/portofolio-spring-keycloak/.well-known/openid-configuration", type = SecuritySchemeType.OPENIDCONNECT, in = SecuritySchemeIn.HEADER)
public class SpringKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKeycloakApplication.class, args);
	}

}
