package br.com.cod3r.meuprojeto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Cliente;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping()
	public Cliente obterCliente() {
		return new Cliente(28,"pedro","123.456.789-00" );
	}

	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "maria", "987.654.321-00");
	}
}






