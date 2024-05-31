package com.crud.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
public class SpringFoxConfig {
	
	@Bean
	public Docket api(){
		 return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
		          .apis(RequestHandlerSelectors.basePackage("com.crud"))           
		          .build()
		          .apiInfo(apiInfo()); 
		
	}
	
	public ApiInfo apiInfo() {
		
		 ApiInfo apiInfo = new ApiInfo(
	                "My Project's REST API",
	                "This is a description of your API.",
	                "version-1",
	                "API TOS",
	                "me@wherever.com",
	                "API License",
	                "API License URL"
	        );
		 return apiInfo;
	}

}
