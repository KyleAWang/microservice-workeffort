package com.kyle.microservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Kyle on 10/7/2017.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket produceApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kyle.microservices.controllers"))
                .build();
    }

    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Work Effort Rest API",
                "Work Effort Management Service",
                "1.0",
                "Terms of service",
                new Contact("Kyle", "localhost", "demo@demo.com"),
                "", ""
        );
        return apiInfo;
    }
}
