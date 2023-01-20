package com.crud.estudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//RestCrontroller =  @Controller e @ResponseBody, retorna o objeto e os dados do objeto são gravados diretamente na resposta HTTP como JSON
//O @Controller é uma especialização da anotação @Component enquanto o @RestController é uma especialização da anotação @Controller.
@RestController
public class EstudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoApplication.class, args); }
	//GetMapping =
		@GetMapping("/")
				public String index() {return "Olá Mundo!";}


	}
