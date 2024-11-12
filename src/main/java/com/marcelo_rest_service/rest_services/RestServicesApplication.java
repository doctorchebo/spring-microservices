package com.marcelo_rest_service.rest_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class RestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServicesApplication.class, args);
	}

	@Bean
	public LocaleResolver localResolver(){
//		SessionLocaleResolver localResolver = new SessionLocaleResolver();
		AcceptHeaderLocaleResolver localResolver = new AcceptHeaderLocaleResolver();
		localResolver.setDefaultLocale(Locale.US);
		return localResolver;
	}

//	@Bean
//	ResourceBundleMessageSource messageSource(){
//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasename("messages");
//		return messageSource;
//	}

}
