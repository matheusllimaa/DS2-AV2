package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.domain.Veterinario;
import com.example.demo.services.EspecieService;
import com.example.demo.services.VeterinarioService;

@RestController
@RequestMapping(value="/veterinario")
public class VeterinarioResource {

	@Autowired
	VeterinarioService service;
	
	@RequestMapping(value = "/id}" ,method = RequestMethod.GET)
public ResponseEntity<Veterinario> find(@PathVariable Integer id){
		

Veterinario obj = service.buscar(id);
 
 return ResponseEntity.ok().body(obj);
}
}