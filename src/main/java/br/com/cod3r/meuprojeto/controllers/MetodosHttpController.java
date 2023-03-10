package br.com.cod3r.meuprojeto.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

	@GetMapping
	public String get() {

		return "requisição Get";
	}

	@PostMapping
	public String post() {

		return "requisição POST";
	}

	@PutMapping
	public String put() {

		return "requisição Put";
	}

	@PatchMapping
	public String patch() {

		return "requisição patch";
	}

	@DeleteMapping
	public String delete() {

		return "requisição DELETE";
	}

}
