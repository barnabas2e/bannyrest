package com.bannyrest.bannyrest.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.pathMapping("/")
				.apiInfo(metaData());
	}
	
	private ApiInfo metaData() {
		Contact contact = new Contact("Barnabas Ebadan", "https://github.com/barnabas2e/bannyrest", "barnabas2e@yahoo.com");
		return new ApiInfo(
			"Banny Rest Api",
			"Rest Api example with Spring boot 2",
			"1.0",
			"Terms of Service: See terms of service blah blah blah",
			contact,
			"Apache License Version: 2.0",
			"https://www.apache.org/license/LICENSE-2.0",
			new ArrayList<>());
		
	}
}
