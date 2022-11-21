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
@Table(name = "equipe")
public class Equipe {

	@Id
	@Column(name = "codigo", nullable = false)
	private int codigo;
	@Column(name = "nome", length = 50, nullable = false)
	private String nome;
	
}
