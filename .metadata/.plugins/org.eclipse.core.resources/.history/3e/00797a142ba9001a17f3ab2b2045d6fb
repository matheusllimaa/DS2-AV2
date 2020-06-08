package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Especie;

@RestController
@RequestMapping(value="/especimes")
public class EspecieResource {

	@RequestMapping(method = RequestMethod.GET)
public List<Especie> listar(){
		

	
	Especie Esp1 = new Especie(1,"felino");
	Especie Esp2 = new Especie(2,"canino");
	
	List<Especie> lista = new ArrayList<>();
	
	lista.add(Esp1);
	lista.add(Esp2);
	return lista;
}
}