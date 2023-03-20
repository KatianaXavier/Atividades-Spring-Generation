package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// indica para o spring que essa é uma classe controladora
@RestController

// indica um endpoint para a aplicação
@RequestMapping("/hello")

public class HelloController {
	
	// indica qual será o verbo da requisição (um de cada vez)
	@GetMapping
	public String helloworld () {
		return "Hello, world!";
	}
	
	// passar uma subrota pra usar o mesmo verbo que outro endpoint
	@GetMapping ("/bsm")
	public String bsm () {
		return "BSMs trabalhadas na Generation:<br/>Persistência, <br/>Mentalidade de Crescimento, <br/>Orientação ao Futuro, <br/>Responsabilidade Pessoal, <br/>Trabalho em Equipe, <br/>Comunicação, <br/>Comunicação Não Violenta, <br/>Atenção para Detalhes, <br/>Proatividade";
	}
	
	// passar uma subrota pra usar o mesmo verbo que outro endpoint
	@GetMapping ("/objetivos")
	public String objetivos () {
		return "Meus objetivos de aprendizagem da semana:<br/>Exercitar minha comunicação, <br/>Organização: não deixar as tarefas de acumularem, <br/>Focar na aula, desativando o chat enquanto presto atenção na aula, <br/>Ler com atenção os cookbooks";
	}

}
