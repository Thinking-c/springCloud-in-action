package com.thinking.gateway;

import com.thinking.gateway.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ApiGatewayFilterApplication {

	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayFilterApplication.class, args);
	}

}
