package com.capg.fms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@ComponentScan(basePackages= {"com.capg.fms"})
@Configuration
@EntityScan("com.capg.fms.entity")
@EnableSwagger2


@SpringBootApplication
public class FlightManagementSystemRamyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightManagementSystemRamyaApplication.class, args);
		System.out.println("Ramya!!!!! Your SpringBoot Application has Started");
	}
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }


}
