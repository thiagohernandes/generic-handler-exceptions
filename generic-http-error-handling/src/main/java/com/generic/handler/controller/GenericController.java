package com.generic.handler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generic.handler.filter.exceptions.ExceptionUnauthorized;
import com.generic.handler.filter.exceptions.ExceptionNotImplemented;

@RestController
@RequestMapping("/api")
public class GenericController {
	
	@GetMapping
	public String teste() {
		return "Teste";
	}
	
	@GetMapping("/erro")
	public String teste2() {
		throw new ExceptionUnauthorized("Não autorizado!!");
	}
	
	@GetMapping("/erro2")
	public String teste3() {
		throw new ExceptionNotImplemented("Sem implementação");
	}

}
