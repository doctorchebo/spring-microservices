package com.marcelo_rest_service.rest_services.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customizeOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Marcelo API")
                        .version("v1")
                        .description("Test API for users and posts"));
    }
}
