package com.oauth2.githublogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {

	@GetMapping("/")
	public String home() {return "Pagina pode ser acessada sem Oauth2";}
	
	@GetMapping("/recurso")
	public String recurso() { return "Pagina do recurso so sera acessada apos o login";}
}