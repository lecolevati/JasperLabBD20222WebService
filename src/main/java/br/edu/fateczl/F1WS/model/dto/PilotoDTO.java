package br.edu.fateczl.F1WS.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PilotoDTO {
	
	private int numero;
	private String nome;
	private EquipeDTO equipe;

}
