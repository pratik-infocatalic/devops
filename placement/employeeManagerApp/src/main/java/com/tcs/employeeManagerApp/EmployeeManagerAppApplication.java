package com.tcs.employeeManagerApp;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class EmployeeManagerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerAppApplication.class, args);
	}
	
	public CorsFilter corsFilter() {
	CorsConfiguration cors=new CorsConfiguration();
	cors.setAllowCredentials(true);
	cors.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
	cors.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin","Content-Type",
			"Accept","Authorization","Origin , Accept","X-Requested-With","Access-Control-Request-Method",
			"Access-Control-Headers"));
	cors.setExposedHeaders(Arrays.asList("Origin","Content-Type","Accept","Authorization","Access-Control-Allow-Origin",
			"Access-Control-Allow-Credentials"));
	cors.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS"));
	UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
	source.registerCorsConfiguration("/*", cors);
	
		return new CorsFilter((CorsConfigurationSource) source);
	}

}
