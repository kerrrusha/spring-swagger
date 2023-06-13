package com.kerrrusha.springswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static java.util.Collections.emptyList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kerrrusha.springswagger"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Product REST API",
                "Demo of Swagger at Spring Boot <b>2.1.18RELEASE</b>, Product REST API",
                "1.0",
                "https://github.com/kerrrusha/spring-swagger",
                new Contact("Kirill Koval", "https://github.com/kerrrusha/", "brcyrill2@gmail.com"),
                null,
                null,
                emptyList());
    }

}
