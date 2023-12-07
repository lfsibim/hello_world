package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generation")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "<h1>Hello World!</h1>";
	}
	
	@GetMapping("/bsm")
	public String genBsm() {
		return "<strong>BSM's Generation Brasil</strong><br />"
				+ "<ul>"
				+ "<li>Orientação ao Detalhe</li>"
				+ "<li>Proatividade</li>"
				+ "<li>Responsabilidade Pessoal</li>"
				+ "<li>Mentalidade de Crescimento</li>"
				+ "<li>Responsabilidade Pessoal</li>"
				+ "<li>Orientação ao Futuro</li>"
				+ "<li>Persistência</li>"
				+ "<li>Comunicação</li>"
				+ "<li>Trabalho em Equipe</li>"
				+ "</ul>";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<strong>Objetivos de aprendizagem</strong><br />"
				+"<ul>"
				+"<li>Aprofundar os estudos em Banco de Dados e MySQL</li>"
				+"<li>Aprofundar os estudos em Spring Boot e API's Rest</li>"
				+"<li>Revisar os conteúdos de Java do Módulo 1</li>"
				+"</ul>";
	}
	
}
