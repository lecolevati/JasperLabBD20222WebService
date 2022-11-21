package br.edu.fateczl.F1WS.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "temp")
public class Temp {

	@Id
	@Column(name = "numero", nullable = false)
	private int numeroPiloto;
	
	@Column(name = "pais", length = 100, nullable = false)
	private String pais;
	
	@Column(name = "nome", length = 200, nullable = false)
	private String nomePiloto;
	
	@Column(name = "equipe", length = 50, nullable = false)
	private String nomeEquipe;
	
	@Column(name = "posicao", nullable = false)
	private int posicao;
	
	@Column(name = "pontos", nullable = false)
	private int pontos;
	

}
