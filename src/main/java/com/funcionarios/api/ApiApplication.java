package com.funcionarios.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.funcionarios.api.modelo.Vendedor;
import com.funcionarios.api.repositorio.VendedorRepositorio;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	@Autowired
	private VendedorRepositorio vendedorRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Vendedor vendedorUm = new Vendedor(null,"francisco","vasconcelos","M0001","teste@teste.com",0,5000,2000);
		Vendedor vendedorDois = new Vendedor (null,"pedro","silva","M0002","teste@teste1.com.br",0,6000,3000);
		vendedorRepositorio.saveAll(Arrays.asList(vendedorUm,vendedorDois));
		

		
	}
}
