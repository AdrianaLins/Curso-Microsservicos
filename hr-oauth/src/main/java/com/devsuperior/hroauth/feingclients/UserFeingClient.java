package com.devsuperior.hroauth.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.devsuperior.hroauth.entities.User;

@Component //Componente gerenciado pelo spring
@FeignClient(name = "hr-user", path = "/users") //FeignClient para se comunicar com o serviço user
public interface UserFeingClient {
	
	@GetMapping(value = "/search")
	ResponseEntity<User> findByEmail(@RequestParam String email);

}
