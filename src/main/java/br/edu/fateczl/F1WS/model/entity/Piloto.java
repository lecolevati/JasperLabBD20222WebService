package br.edu.fateczl.F1WS.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "piloto")
public class Piloto {

	@Id
	@Column(name = "numero", nullable = false)
	private int numero;
	@Column(name = "nome", length = 200, nullable = false)
	private String nome;
	@ManyToOne(targetEntity = Equipe.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "equipe", nullable = false)
	private Equipe equipe;
}
