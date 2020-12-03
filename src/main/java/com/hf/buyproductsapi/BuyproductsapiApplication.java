package com.hf.buyproductsapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hf.buyproductsapi.domain.Categoria;
import com.hf.buyproductsapi.repositories.CategoriaRepository;

@SpringBootApplication
public class BuyproductsapiApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository; 

	public static void main(String[] args) {
		SpringApplication.run(BuyproductsapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));	
	}

}
