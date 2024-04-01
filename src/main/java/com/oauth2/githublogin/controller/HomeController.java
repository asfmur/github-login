package com.oauth2.githublogin.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		
		return "Voce esta na pagina inicial de acesso livre";
		
	}
	
	@GetMapping("/PaginaDoRecurso")
	public String recurso() {
		
		return "Voce esta na pagina do recurso privado e entro por meio do lo gin github";
		
	}
	

}
