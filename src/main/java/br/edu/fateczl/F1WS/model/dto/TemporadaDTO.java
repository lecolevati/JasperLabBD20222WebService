package br.edu.fateczl.F1WS.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TemporadaDTO {
	
	private PilotoDTO piloto;
	private CorridaDTO corrida;
	private int posicao;
	private int pontos;

}
