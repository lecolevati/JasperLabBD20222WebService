package br.edu.fateczl.F1WS.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
@Table(name = "temporada")
@IdClass(TemporadaPK.class)
public class Temporada {
	
	@Id
	@ManyToOne(targetEntity = Piloto.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "numero_piloto", nullable = false)
	private Piloto piloto;
	@Id
	@ManyToOne(targetEntity = Corrida.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_corrida", nullable = false)
	private Corrida corrida;
	@Column(name = "posicao", nullable = false)
	private int posicao;
	@Column(name = "pontos", nullable = true)
	private int pontos;
	
}
