package br.edu.fateczl.F1WS.model.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TemporadaPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Piloto piloto;
	private Corrida corrida;
	
}
