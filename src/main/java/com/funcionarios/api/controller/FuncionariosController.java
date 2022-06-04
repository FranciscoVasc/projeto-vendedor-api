package com.funcionarios.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.funcionarios.api.modelo.Vendedor;
import com.funcionarios.api.repositorio.VendedorRepositorio;

@RestController
@RequestMapping("/api")
public class FuncionariosController {
	@Autowired // ele garante uma instancia
	private VendedorRepositorio vendedorRepositorio;

	@RequestMapping(method = RequestMethod.GET)
	public List<Vendedor> listarVendedores() {

		return vendedorRepositorio.findAll();

	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Vendedor> salvarVendedor(@RequestBody Vendedor vendedor) {

		vendedorRepositorio.save(vendedor);
		return ResponseEntity.status(HttpStatus.CREATED).build();

	}
}
