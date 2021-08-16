package com.devsuperior.payroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//classe de configuração do spring

@Configuration
public class AppConfig {
	
	//registra uma instancia única que fica disponível para o projeto e injetar em outros componentes
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
