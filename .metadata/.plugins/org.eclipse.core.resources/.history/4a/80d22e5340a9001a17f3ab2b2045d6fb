package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Veterinario;
import com.example.demo.repositories.VeterinarioRepository;

@Service
public class VeterinarioService {
	@Autowired
	
private VeterinarioRepository veterinarioRepositorio;
	
	public List<Veterinario>list {
   JpaRepository<Veterinario, Integer> veterinarioRepository;
return veterinarioRepository.findAll();

	
	}
public Veterinario find(Integer id) {
CrudRepository<Veterinario, Integer> veterinarioRepository;
return veterinarioRepository.findById(id).get();
}

}

