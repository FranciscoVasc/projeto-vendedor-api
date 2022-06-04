package com.funcionarios.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.funcionarios.api.modelo.Vendedor;

@Repository
public interface VendedorRepositorio extends JpaRepository<Vendedor, Integer> {

}
