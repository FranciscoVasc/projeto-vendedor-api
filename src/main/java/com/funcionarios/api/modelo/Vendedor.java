package com.funcionarios.api.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // para Jpa saber que é uma entidade em toda class
public class Vendedor implements Serializable {
// ele faz a serialização da class
	private static final long serialVersionUID = 1L;
	
	//dados funcionario
	@Id // indetifica o Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // vai encrementa de 1 em 1 
    private Integer id; 
    private String nome; 
    private String sobrenome; 
    @Column(unique = true) // para deixa a matricula unica 
    private String matricula;
    private String email;
    private int cargo; 
    private double salario;
    private double comisao;
    
	public Vendedor(Integer id, String nome, String sobrenome, String matricula, String email, int cargo, double salario,
			double comisao) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.matricula = matricula;
		this.email = email;
		this.cargo = cargo;
		this.salario = salario;
		this.comisao = comisao;
	}
	
	
	public Vendedor() {
		
	} // construtor vazio para fucionamento da JPA
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome; 
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCargo() {
		return cargo;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComisao() {
		return comisao;
	}
	public void setComisao(double comisao) {
		this.comisao = comisao;
	}
}
