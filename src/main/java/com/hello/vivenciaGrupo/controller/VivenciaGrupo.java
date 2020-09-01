package com.hello.vivenciaGrupo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vivencia")
@CrossOrigin("*")
public class VivenciaGrupo {
	@GetMapping
	public String vivenciaController(){
		return " Minha experiência em grupo mais marcante foi quando soube q minha família é o meu grupo preferido";
		
	}
}
