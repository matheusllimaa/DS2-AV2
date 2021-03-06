package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Especie;
import com.example.demo.domain.Veterinario;
import com.example.demo.repositories.EspecieRepository;
import com.example.demo.repositories.VeterinarioRepository;

@SpringBootApplication
public class ClinicaVeterinariaApplication implements CommandLineRunner {

	@Autowired
	EspecieRepository especieRepository;
	public static void main(String[] args) {
		SpringApplication.run(ClinicaVeterinariaApplication.class, args);
	
	}
	
	@Autowired
	VeterinarioRepository veterinaryoRepository;
	public static void min(String[] args) {
	   SpringApplication.run(ClinicaVeterinariaApplication.class, args);
	}
	
	
@Override
public void run(String...args)throws Exception{


	Especie Esp1 = new Especie(null,"felinos");
	Especie Esp2 = new Especie(null,"caninos");
	
	
	
	this.especieRepository.saveAll(Arrays.asList(Esp1,Esp2));
	
	Veterinario n1 = new Veterinario(null, "Flavio Pinto", "12365654-45");
	Veterinario n2 = new Veterinario(null, "Michel Temer", "9876543-33");
	Veterinario n3 = new Veterinario(null, "Juciel Filho", "3434999-21");

	veterinarioRepository.saveAll(Arrays.asList(n1,n2,n3));
}



}